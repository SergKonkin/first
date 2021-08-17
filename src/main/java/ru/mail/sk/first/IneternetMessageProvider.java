package ru.mail.sk.first;

public class IneternetMessageProvider implements MessageProvider {

    @Override
    public String getMesssage() {
        return "Internet message recieved";
    }

}
