package com.qingxuan.database.compare.query.postgres;

import com.qingxuan.database.compare.query.ConnectionProperties;
import com.qingxuan.database.compare.query.Query;
import com.qingxuan.database.compare.query.QueryFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * mysql工厂
 *
 * @author qingxuan 2022/9/13
 * @since 1.0
 */
public class PostgresqlQueryFactory implements QueryFactory {

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Query getInstance(ConnectionProperties properties) throws SQLException {
        PostgresqlQuery query = new PostgresqlQuery();
        String url = "jdbc:postgresql://" + properties.getIp() + ":" + properties.getPort() + "/" +
                properties.getDatabase();
        Connection connection = DriverManager.getConnection(url, properties.getUsername(), properties.getPassword());
        query.setConnection(connection);
        return query;
    }
}
