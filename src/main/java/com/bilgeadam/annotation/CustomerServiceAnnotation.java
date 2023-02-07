package com.bilgeadam.annotation;

import org.springframework.stereotype.Component;

@Component
public class CustomerServiceAnnotation {

    INotificaton notificaton;
    //const. injection
    public CustomerServiceAnnotation(INotificaton notificaton) {
        this.notificaton = notificaton;
    }

    public void  setNotificaton(){
        notificaton.sendNotification();
    }
}
