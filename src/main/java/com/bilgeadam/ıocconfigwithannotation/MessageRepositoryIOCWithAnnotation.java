package com.bilgeadam.ıocconfigwithannotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("message")
public class MessageRepositoryIOCWithAnnotation implements INotificaton {


    public void sendMessage(){
        System.out.println("Musteriye msj atıldı");
    }


    @Override
    public void sendNotification() {
        System.out.println("Musteriye msj atıldı");
    }
}
