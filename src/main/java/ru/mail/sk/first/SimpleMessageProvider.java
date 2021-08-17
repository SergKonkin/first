package ru.mail.sk.first;


import org.springframework.stereotype.Component;

@Component("provider")
public class SimpleMessageProvider implements IMessageProvider {

    @Override
    public String getMessage() {
        return "Hello world";
    }

}
