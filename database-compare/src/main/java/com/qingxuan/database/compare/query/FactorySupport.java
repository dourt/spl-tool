package com.qingxuan.database.compare.query;

import com.qingxuan.database.compare.query.mysql.MysqlQueryFactory;
import com.qingxuan.database.compare.query.postgres.PostgresqlQueryFactory;
import org.apache.commons.lang3.StringUtils;

/**
 * @author qingxuan 2022/9/13 19:33
 * @since 1.0
 */
public class FactorySupport {

    public static QueryFactory getQueryFactory(String type) {
        if (StringUtils.equalsIgnoreCase(QueryEnum.MYSQL.name(), type)) {
            return new MysqlQueryFactory();
        }
        if (StringUtils.equalsIgnoreCase(QueryEnum.POSTGRESQL.name(), type)) {
            return new PostgresqlQueryFactory();
        }
        return null;
    }

}
