package ru.mail.sk.first;

public class SimpleMessageRenderer implements MessageRenderer {

    private MessageProvider provider;

    public SimpleMessageRenderer(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public void render() {
        System.out.println(provider.getMesssage());
    }

}
