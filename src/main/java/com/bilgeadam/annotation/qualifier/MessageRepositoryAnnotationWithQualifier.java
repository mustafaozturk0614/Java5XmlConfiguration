package com.bilgeadam.annotation.qualifier;

import com.bilgeadam.annotation.INotificaton;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("message")
public class MessageRepositoryAnnotationWithQualifier implements INotificaton {


    public void sendMessage(){
        System.out.println("Musteriye msj atıldı");
    }


    @Override
    public void sendNotification() {
        System.out.println("Musteriye msj atıldı");
    }
}
