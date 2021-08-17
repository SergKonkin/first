package ru.mail.sk.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("renderer")
public class SimpleMessageRenderer implements MessageRenderer {

    private MessageProvider provider;

    @Autowired
    public SimpleMessageRenderer(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public void render() {
        System.out.println(provider.getMesssage());
    }

}
