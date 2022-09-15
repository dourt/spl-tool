package com.qingxuan.database.compare.query.mysql;

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
public class MysqlQueryFactory implements QueryFactory {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Query getInstance(ConnectionProperties properties) throws SQLException {
        MysqlQuery query = new MysqlQuery();
        String url = "jdbc:mysql://" + properties.getIp() + ":" + properties.getPort() + "/" +
                properties.getDatabase() + "?useUnicode=yes&characterEncoding=UTF-8&allowMultiQueries=" +
                "true&autoReconnect=true&useSSL=no&serverTimezone=Asia/Shanghai";
        Connection connection = DriverManager.getConnection(url, properties.getUsername(), properties.getPassword());
        query.setConnection(connection);
        return query;
    }
}
