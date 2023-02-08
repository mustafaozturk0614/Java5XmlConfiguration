package com.bilgeadam.ıocconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MailRepositoryIOC implements INotificaton {


    public void sendMail(){

        System.out.println("Musteriye mail atıldı");
    }

    @Override
    public void sendNotification() {
        System.out.println("Musteriye mail atıldı");
    }
}
