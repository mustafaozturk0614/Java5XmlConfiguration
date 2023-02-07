package com.bilgeadam.annotation.qualifier;

import com.bilgeadam.annotation.INotificaton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceAnnotationWithQualifier {
    @Autowired
    @Qualifier("mail")
    INotificaton notificaton;



    public void  setNotificaton(){
        notificaton.sendNotification();
    }
}
