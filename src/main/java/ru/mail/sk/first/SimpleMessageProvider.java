package ru.mail.sk.first;

public class SimpleMessageProvider implements MessageProvider {

    @Override
    public String getMesssage() {
        return "Hello world";
    }

}
