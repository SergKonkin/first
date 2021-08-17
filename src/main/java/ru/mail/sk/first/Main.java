package ru.mail.sk.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

//        MessageRenderer renderer = MessageFactory.getRenderer();

//        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        IMessageRenderer renderer = context.getBean("renderer", IMessageRenderer.class);
        renderer.render();

    }
}
