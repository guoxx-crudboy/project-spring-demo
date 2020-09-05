package com.guoxx;

import com.guoxx.event.EmailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args){
        event();
    }

    /**
     * spring event
     */
    public static void event(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-event.xml");
        EmailService emailService = (EmailService) context.getBean("emailService");
        emailService.sendEmail("known.spammer@example.org","test");
    }
}
