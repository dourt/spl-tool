package com.qingxuan.database.compare.query.mongodb;

import com.qingxuan.database.compare.query.ColumnInfo;
import com.qingxuan.database.compare.query.Query;

import java.util.List;

/**
 * mongodb获取模式、表/集合、字段
 *
 * @author qingxuan 2022/9/13
 * @since 1.0
 */
public class MongodbQuery implements Query {

    @Override
    public List<String> getDatabase() {
        return null;
    }

    @Override
    public List<String> getTable(String name) {
        return null;
    }

    @Override
    public List<ColumnInfo> getColumn(String name) {
        return null;
    }

    @Override
    public void close() throws Exception {
        //do nothing
    }
}
