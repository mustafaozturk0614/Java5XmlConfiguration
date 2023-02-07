package com.bilgeadam.xml.databaseornek;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    İki tana Repositorymiz olacak Biri Postgre için
    biri Mysql için

    bir tane loglama metodumuz olacak

    servisimiz bu metotlara repositoryler uzerinden
    erişecek

    daha sonra test sınıfında servis uzerinden
    loglama metodumuz çalışacak

    bu yapıyı xml configuraiton olarak kuralım


 */
public class TestDatabase {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        DatabaseService databaseService=new
                DatabaseService(context.getBean("database",IDatabase.class));
          databaseService.logToDatabase();

          DatabaseService databaseService2=context.getBean("dbservice", DatabaseService.class);
        databaseService2.logToDatabase();
    }
}
