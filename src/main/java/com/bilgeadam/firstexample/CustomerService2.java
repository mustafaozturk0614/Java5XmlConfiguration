package com.bilgeadam.firstexample;

public class CustomerService2 {


    INotificaton notificaton;
    //const. injection
    public CustomerService2(INotificaton notificaton) {
        this.notificaton = notificaton;
    }

    public void  setNotificaton(){
        notificaton.sendNotification();
    }
}
