package com.bilgeadam.annotation;

import com.bilgeadam.firstexample.CustomerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        CustomerServiceAnnotation customerService=
                context.getBean(CustomerServiceAnnotation.class);
        customerService.setNotificaton();

    }
}
