package com.bilgeadam.xml.databaseornek;

public class MysqlRepository implements IDatabase{
    String url;
    String username;
    @Override
    public void logToDatabase() {
        System.out.println("username==>"+username);
        System.out.println(url+ "Mysql'e loglandı");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
