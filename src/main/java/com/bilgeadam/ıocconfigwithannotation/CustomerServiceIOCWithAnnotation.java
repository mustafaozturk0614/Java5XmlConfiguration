package com.bilgeadam.ıocconfigwithannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceIOCWithAnnotation {
    @Autowired
    @Qualifier("message")
    INotificaton notificaton;
    //const. injection
//    public CustomerServiceIOCWithAnnotation(
//    INotificaton notificaton) {
//        this.notificaton = notificaton;
//    }
    public void  setNotificaton(){
        notificaton.sendNotification();
    }
}
