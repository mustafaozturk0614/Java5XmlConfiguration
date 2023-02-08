package com.bilgeadam.ıocconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(IocConfig.class);

        INotificaton myNotificaton=context.getBean("notificaton", INotificaton.class);
        myNotificaton.sendNotification();
        CustomerServiceIOC customerServiceIOC=context.getBean("service", CustomerServiceIOC.class);
        customerServiceIOC.setNotificaton();

    }
}
