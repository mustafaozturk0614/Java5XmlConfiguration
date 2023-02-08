package com.bilgeadam.ıocconfigwithannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(IocConfigWithAnnotation.class);
//
//        INotificaton myNotificaton=context.getBean("notificaton", INotificaton.class);
//        myNotificaton.sendNotification();
        CustomerServiceIOCWithAnnotation customerServiceIOC=context.getBean(CustomerServiceIOCWithAnnotation.class);
        customerServiceIOC.setNotificaton();

    }
}
