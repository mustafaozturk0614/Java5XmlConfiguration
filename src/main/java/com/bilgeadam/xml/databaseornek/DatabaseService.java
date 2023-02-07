package com.bilgeadam.xml.databaseornek;

public class DatabaseService {

    IDatabase database;

    public DatabaseService(IDatabase database) {
        this.database = database;
    }
    public void logToDatabase(){
        database.logToDatabase();
    }
}
