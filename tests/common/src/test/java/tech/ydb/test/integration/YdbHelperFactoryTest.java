package tech.ydb.test.integration;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import tech.ydb.core.grpc.GrpcTransport;

/**
 *
 * @author Aleksandr Gorshenin
 */
public class YdbHelperFactoryTest {

    @Rule
    public final TemporaryFolder tempFolder = new TemporaryFolder();

    private final GrpcTransportMock transportMock = new GrpcTransportMock();

    @After
    public void cleanup() {
        transportMock.close();
    }

    @Test
    public void defaultInstanceTest() {
        YdbHelperFactory factory = YdbHelperFactory.getInstance();

        Assert.assertNotNull("check disabled factory instance", factory);
        Assert.assertFalse("check disabled factory instance", factory.isEnabled());
        Assert.assertNull("empty helper for disabled factory instance", factory.createHelper());
    }

    @Test
    public void externalNonTlsInstanceTest() {
        transportMock.setup("/database");

        YdbEnvironmentMock env = YdbEnvironmentMock.create()
                .with("YDB_ENDPOINT", "localhost:1234")
                .with("YDB_DATABASE", "/database");

        YdbHelperFactory factory = YdbHelperFactory.createYdbHelper(env);

        Assert.assertNotNull("check external factory instance", factory);
        Assert.assertTrue("check external factory instance", factory.isEnabled());

        try (YdbHelper helper = factory.createHelper()) {
            Assert.assertNotNull("external helper is not null", helper);

            Assert.assertEquals("check helper endpoint", "localhost:1234", helper.endpoint());
            Assert.assertEquals("check helper database", "/database", helper.database());
            Assert.assertNull("check helper auth token", helper.authToken());
            Assert.assertFalse("check helper tls mode", helper.useTls());
            Assert.assertNull("check helper pem cert", helper.pemCert());

            try (GrpcTransport transport = helper.createTransport("local_test")) {
                Assert.assertEquals("/database/local_test", transport.getDatabase());
                Assert.assertTrue(transport.unaryCall(null, null, null).join().isSuccess());
            }
        }
    }

    @Test
    public void externalTlsInstanceTest() throws IOException {
        transportMock.setup("/tls");

        byte[] pemBody = new byte[] { 0x1, 0x3, 0x2, 0x4 }; // dump file
        File pem = tempFolder.newFile("tls.pem");

        try (FileOutputStream os = new FileOutputStream(pem)) {
            os.write(pemBody);
            os.flush();
        }

        YdbEnvironmentMock env = YdbEnvironmentMock.create()
                .with("YDB_ENDPOINT", "localhost:1234")
                .with("YDB_DATABASE", "/tls")
                .with("YDB_USE_TLS", "true")
                .with("YDB_PEM_CERT", pem.getAbsolutePath());

        YdbHelperFactory factory = YdbHelperFactory.createYdbHelper(env);

        Assert.assertNotNull("check external factory instance", factory);
        Assert.assertTrue("check external factory instance", factory.isEnabled());

        try (YdbHelper helper = factory.createHelper()) {
            Assert.assertNotNull("external helper is not null", helper);

            Assert.assertEquals("check helper endpoint", "localhost:1234", helper.endpoint());
            Assert.assertEquals("check helper database", "/tls", helper.database());
            Assert.assertNull("check helper auth token", helper.authToken());
            Assert.assertTrue("check helper tls mode", helper.useTls());
            Assert.assertArrayEquals("check helper pem cert", pemBody, helper.pemCert());

            try (GrpcTransport transport = helper.createTransport("local_tls")) {
                Assert.assertEquals("/tls/local_tls", transport.getDatabase());
                Assert.assertTrue(transport.unaryCall(null, null, null).join().isSuccess());
            }
        }
    }

    @Test
    public void externalAuthInstanceTest() throws IOException {
        transportMock.setup("/token");

        YdbEnvironmentMock env = YdbEnvironmentMock.create()
                .with("YDB_ENDPOINT", "localhost:4321")
                .with("YDB_DATABASE", "/token")
                .with("YDB_USE_TLS", "true")
                .with("YDB_TOKEN", "TOKEN1234")
                .with("YDB_PEM_CERT", "/not_exists_file.pem");

        YdbHelperFactory factory = YdbHelperFactory.createYdbHelper(env);

        Assert.assertNotNull("check external factory instance", factory);
        Assert.assertTrue("check external factory instance", factory.isEnabled());

        try (YdbHelper helper = factory.createHelper()) {
            Assert.assertNotNull("external helper is not null", helper);

            Assert.assertEquals("check helper endpoint", "localhost:4321", helper.endpoint());
            Assert.assertEquals("check helper database", "/token", helper.database());
            Assert.assertEquals("check helper auth token", "TOKEN1234", helper.authToken());
            Assert.assertTrue("check helper tls mode", helper.useTls());
            Assert.assertNull("check helper pem cert", helper.pemCert());

            try (GrpcTransport transport = helper.createTransport("local_grpc")) {
                Assert.assertEquals("/token/local_grpc", transport.getDatabase());
                Assert.assertTrue(transport.unaryCall(null, null, null).join().isSuccess());
            }
        }
    }

    @Test
    public void dockerUnavailableInstanceTest() {
        try (DockerMock docker = new DockerMock()) {
            docker.setup(Boolean.FALSE);

            YdbHelperFactory factory = YdbHelperFactory.createYdbHelper(YdbEnvironmentMock.create());

            Assert.assertNotNull("check disabled factory instance", factory);
            Assert.assertFalse("check disabled factory instance", factory.isEnabled());
            Assert.assertNull("empty helper for disabled factory instance", factory.createHelper());
        }
    }

    @Test
    public void dockerInstanceTest() {
        try (DockerMock docker = new DockerMock()) {
            docker.setup(Boolean.TRUE);

            YdbHelperFactory factory = YdbHelperFactory.createYdbHelper(YdbEnvironmentMock.create());

            Assert.assertNotNull("check docker factory instance", factory);
            Assert.assertTrue("check docker factory instance", factory.isEnabled());
        }
    }

    @Test
    public void wrongEnvTest() {
        try (DockerMock docker = new DockerMock()) {
            docker.setup(Boolean.FALSE);

            YdbHelperFactory factory1 = YdbHelperFactory.createYdbHelper(YdbEnvironmentMock.create()
                    .with("YDB_ENDPOINT", "localhost:1234")
                    .with("YDB_DATABASE", "")
            );

            Assert.assertNotNull("check disabled factory instance", factory1);
            Assert.assertFalse("check disabled factory instance", factory1.isEnabled());
            Assert.assertNull("empty helper for disabled factory instance", factory1.createHelper());

            YdbHelperFactory factory2 = YdbHelperFactory.createYdbHelper(YdbEnvironmentMock.create()
                    .with("YDB_ENDPOINT", "")
                    .with("YDB_DATABASE", "/local")
            );

            Assert.assertNotNull("check disabled factory instance", factory2);
            Assert.assertFalse("check disabled factory instance", factory2.isEnabled());
            Assert.assertNull("empty helper for disabled factory instance", factory2.createHelper());

            YdbHelperFactory factory3 = YdbHelperFactory.createYdbHelper(YdbEnvironmentMock.create()
                    .with("YDB_ENDPOINT", "localhost:1234")
            );

            Assert.assertNotNull("check disabled factory instance", factory3);
            Assert.assertFalse("check disabled factory instance", factory3.isEnabled());
            Assert.assertNull("empty helper for disabled factory instance", factory3.createHelper());
        }
    }
}
