package ru.mail.sk.first;

import lombok.Getter;

import java.io.InputStream;
import java.util.Properties;

public class MessageFactory {

    @Getter
    private static MessageProvider provider;
    @Getter
    private static MessageRenderer renderer;

    static {
        Properties properties = new Properties();
        try(InputStream in = MessageFactory.class.getClassLoader().getResourceAsStream("app.properties")){
            properties.load(in);
            String messageProviderClass = properties.getProperty("messageProviderClass");
            String messageRendererClass = properties.getProperty("messageRendererClass");
            provider = (MessageProvider) Class.forName(messageProviderClass).newInstance();
            renderer = (MessageRenderer) Class.forName(messageRendererClass)
                    .getConstructor(MessageProvider.class).newInstance(provider);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
