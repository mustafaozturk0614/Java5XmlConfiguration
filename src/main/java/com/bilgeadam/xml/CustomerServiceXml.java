package com.bilgeadam.xml;

public class CustomerServiceXml {


    INotificaton notificaton;
    //const. injection
    public CustomerServiceXml(INotificaton notificaton) {
        this.notificaton = notificaton;
    }

    public void  setNotificaton(){
        notificaton.sendNotification();
    }
}
