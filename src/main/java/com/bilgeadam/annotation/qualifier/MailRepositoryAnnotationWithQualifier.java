package com.bilgeadam.annotation.qualifier;

import com.bilgeadam.annotation.INotificaton;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mail")
public class MailRepositoryAnnotationWithQualifier implements INotificaton {


    public void sendMail(){

        System.out.println("Musteriye mail atıldı");
    }

    @Override
    public void sendNotification() {
        System.out.println("Musteriye mail atıldı");
    }
}
