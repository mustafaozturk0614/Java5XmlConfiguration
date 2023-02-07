package com.bilgeadam.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext
                        ("applicationContext.xml");

        CustomerServiceXml customerServiceXml=
                new CustomerServiceXml(
                        context.getBean("notifcation", INotificaton.class));

        customerServiceXml.setNotificaton();

    }
}
