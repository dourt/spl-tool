package com.qingxuan.database.compare.query.postgres;

import com.qingxuan.database.compare.query.ColumnInfo;
import com.qingxuan.database.compare.query.Query;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author qingxuan 2022/9/14
 * @since 1.0
 */
public class PostgresqlQuery implements Query {

    /**
     * postgresql数据库连接
     */
    private Connection connection;

    @Override
    public List<String> getDatabase() throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        return queryRunner.query(connection, PostgresqlStatementEnum.DATABASE.getStatement(),
                new ColumnListHandler<>());
    }

    @Override
    public List<String> getSchemata(String name) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        return queryRunner.query(connection, PostgresqlStatementEnum.SCHEMATA.getStatement(),
                new ColumnListHandler<>());
    }

    @Override
    public List<String> getTable(String name) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        return queryRunner.query(connection, PostgresqlStatementEnum.TABLE.getStatement(),
                new ColumnListHandler<>(), name);
    }

    @Override
    public List<ColumnInfo> getColumn(String name) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        return queryRunner.query(connection, PostgresqlStatementEnum.COLUMN.getStatement(),
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
