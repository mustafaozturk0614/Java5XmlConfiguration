package com.bilgeadam.firstexample;

public class MessageRepository implements INotificaton{


    public void sendMessage(){
        System.out.println("Musteriye msj atıldı");
    }


    @Override
    public void sendNotification() {
        System.out.println("Musteriye msj atıldı");
    }
}
