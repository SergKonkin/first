package ru.mail.sk.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("renderer")
public class SimpleMessageRenderer implements IMessageRenderer {

    private IMessageProvider provider;

    @Autowired
    public SimpleMessageRenderer(IMessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public void render() {
        System.out.println(provider.getMessage());
    }

}
