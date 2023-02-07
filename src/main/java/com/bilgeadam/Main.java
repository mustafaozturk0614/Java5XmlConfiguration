package com.bilgeadam;

import com.bilgeadam.firstexample.CustomerService;
import com.bilgeadam.firstexample.CustomerService2;
import com.bilgeadam.firstexample.MailRepository;
import com.bilgeadam.firstexample.MessageRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
1-Başlangıcta MessageRepository ve Customer Service sınıflarımız olsun
MessageRepository de sendemessage isimli bir fonksiyonumuz olsun bu fonksiyon çıktı olarak
müsteriye ms atıldı cıktsını verebilir
Daha sonra customer sevicede bir sendmessage fonksiyonu yazıp repositorydeki fonkisyonu
bu metot içerisinde çağıracagız
Daha sonra Test sınıfında service uzerinde bu metodu çalıştıralım
2- artık musteriye mailde atılabilsin
 */

public class Main {
    public static void main(String[] args) {

        //1.kısım
        CustomerService customerService=new CustomerService();
        customerService.sendMessage();
        //2.Kısım
        CustomerService customerService2=new CustomerService(new MailRepository());
        customerService2.sendMail();

        CustomerService2 customerService3=new CustomerService2(new MessageRepository());
        customerService3.setNotificaton();
    }
}