package ru.mail.sk.first;

public class IneternetMessageProvider implements IMessageProvider {

    @Override
    public String getMesssage() {
        return "Internet message received";
    }

}
