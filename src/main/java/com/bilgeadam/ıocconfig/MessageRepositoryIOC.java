package com.bilgeadam.ıocconfig;

import org.springframework.stereotype.Component;

@Component

public class MessageRepositoryIOC implements INotificaton {


    public void sendMessage(){
        System.out.println("Musteriye msj atıldı");
    }


    @Override
    public void sendNotification() {
        System.out.println("Musteriye msj atıldı");
    }
}
