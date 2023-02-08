package com.bilgeadam.ıocconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// En geniş hali Compenent ---> service repository controller
@Configuration
@ComponentScan("com.bilgeadam.ıocconfig")
public class IocConfig {
    @Bean
    public INotificaton notificaton(){
        return new MessageRepositoryIOC();
    }

    @Bean
    public CustomerServiceIOC service(){
        return new CustomerServiceIOC(notificaton());
    }

}
