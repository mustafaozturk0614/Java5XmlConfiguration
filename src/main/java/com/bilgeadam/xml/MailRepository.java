package com.bilgeadam.xml;

public class MailRepository implements INotificaton {


    public void sendMail(){

        System.out.println("Musteriye mail atıldı");
    }

    @Override
    public void sendNotification() {
        System.out.println("Musteriye mail atıldı");
    }
}
