package ru.mail.sk.first;


import org.springframework.stereotype.Component;

@Component("provider")
public class SimpleMessageProvider implements MessageProvider {

    @Override
    public String getMesssage() {
        return "Hello world";
    }

}
