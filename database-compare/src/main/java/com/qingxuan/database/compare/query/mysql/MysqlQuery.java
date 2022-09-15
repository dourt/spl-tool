package com.qingxuan.database.compare.query.mysql;

import com.qingxuan.database.compare.query.ColumnInfo;
import com.qingxuan.database.compare.query.Query;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * mysql获取模式、表/集合、字段
 *
 * @author qingxuan 2022/9/13
 * @since 1.0
 */
public class MysqlQuery implements Query {

    /**
     * mysql数据库连接
     */
    private Connection connection;

    @Override
    public List<String> getDatabase() throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        return queryRunner.query(connection, MysqlStatementEnum.DATABASE.getStatement(),
                new ColumnListHandler<>());
    }

    @Override
    public List<String> getTable(String name) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        return queryRunner.query(connection, MysqlStatementEnum.TABLE.getStatement(),
                new ColumnListHandler<>(), name);
    }

    @Override
    public List<ColumnInfo> getColumn(String name) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        return queryRunner.query(connection, MysqlStatementEnum.COLUMN.getStatement(),
                new BeanListHandler<>(ColumnInfo.class), name);
    }

    @Override
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
