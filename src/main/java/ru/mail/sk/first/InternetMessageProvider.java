package ru.mail.sk.first;

public class InternetMessageProvider implements IMessageProvider {

    @Override
    public String getMessage() {
        return "Internet message received";
    }

}
