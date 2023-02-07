package com.bilgeadam.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MailRepositoryAnnotation implements INotificaton {


    public void sendMail(){

        System.out.println("Musteriye mail atıldı");
    }

    @Override
    public void sendNotification() {
        System.out.println("Musteriye mail atıldı");
    }
}
