package com.qingxuan.database.compare;

import com.qingxuan.database.compare.query.*;
import com.qingxuan.database.compare.query.mysql.MysqlQueryFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * @author dourentian 2022/9/9
 * @since 1.0
 */
@SpringBootApplication
public class DatabaseCompareApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseCompareApplication.class, args);
        test();
    }

    private static void test() {
        new MysqlQueryFactory();
        final QueryFactory queryFactory = FactorySupport.getQueryFactory(QueryEnum.MYSQL.name());
        ConnectionProperties properties = new ConnectionProperties();
        properties.setIp("rm-bp161a613p09oq40m.mysql.rds.aliyuncs.com");
        properties.setPort("3306");
        properties.setDatabase("plaso_basic_data");
        properties.setUsername("rw_dev");
        properties.setPassword("Plaso1865");
        try (Query instance = queryFactory.getInstance(properties)) {
            final List<String> table = instance.getDatabase();
            final List<String> data = instance.getTable("plaso_basic_data");
            final List<ColumnInfo> column = instance.getColumn("plaso_basic_data");
            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
