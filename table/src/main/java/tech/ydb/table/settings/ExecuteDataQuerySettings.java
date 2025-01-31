package tech.ydb.table.settings;

import javax.annotation.Nonnull;

import tech.ydb.proto.table.YdbTable;

import static tech.ydb.proto.table.YdbTable.QueryStatsCollection.Mode.STATS_COLLECTION_NONE;

/**
 * @author Sergey Polovko
 */
public class ExecuteDataQuerySettings extends RequestSettings<ExecuteDataQuerySettings> {

    private boolean keepInQueryCache = true;

    private YdbTable.QueryStatsCollection.Mode collectStats = STATS_COLLECTION_NONE;

    public boolean isKeepInQueryCache() {
        return keepInQueryCache;
    }

    public ExecuteDataQuerySettings disableQueryCache() {
        keepInQueryCache = false;
        return this;
    }

    @Nonnull
    public YdbTable.QueryStatsCollection.Mode collectStats() {
        return collectStats;
    }

    public ExecuteDataQuerySettings setCollectStats(@Nonnull YdbTable.QueryStatsCollection.Mode collectStats) {
        this.collectStats = collectStats;
        return this;
    }
}
