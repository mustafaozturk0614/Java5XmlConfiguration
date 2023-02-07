package com.bilgeadam.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MessageRepositoryAnnotation implements INotificaton {


    public void sendMessage(){
        System.out.println("Musteriye msj atıldı");
    }


    @Override
    public void sendNotification() {
        System.out.println("Musteriye msj atıldı");
    }
}
