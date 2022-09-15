package com.qingxuan.database.compare.query;

/**
 * @author qingxuan 2022/9/13
 * @since 1.0
 */
public class ConnectionProperties {

    public ConnectionProperties() {
    }

    /**
     * ip
     */
    private String ip;

    /**
     * port
     */
    private String port;

    /**
     * 数据库名
     */
    private String database;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户名
     */
    private String username;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
