package com.bilgeadam.annotation.qualifier;

import com.bilgeadam.annotation.CustomerServiceAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationWithQualifier {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        CustomerServiceAnnotationWithQualifier customerService=
                context.getBean(CustomerServiceAnnotationWithQualifier.class);
        customerService.setNotificaton();

    }
}
