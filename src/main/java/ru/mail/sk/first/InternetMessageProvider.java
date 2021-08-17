package ru.mail.sk.first;

public class InternetMessageProvider implements IMessageProvider {

    @Override
    public String getMesssage() {
        return "Internet message received";
    }

}
