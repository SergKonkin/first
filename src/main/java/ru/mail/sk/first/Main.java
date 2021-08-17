package ru.mail.sk.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

//        MessageRenderer renderer = MessageFactory.getRenderer();

//        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();

    }
}
