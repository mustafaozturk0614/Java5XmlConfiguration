package com.bilgeadam.ıocconfig;

import org.springframework.stereotype.Component;

@Component
public class CustomerServiceIOC {

    INotificaton notificaton;
    //const. injection
    public CustomerServiceIOC(INotificaton notificaton) {
        this.notificaton = notificaton;
    }

    public void  setNotificaton(){
        notificaton.sendNotification();
    }
}
