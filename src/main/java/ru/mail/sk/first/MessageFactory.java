package ru.mail.sk.first;

import lombok.Getter;

import java.io.InputStream;
import java.util.Properties;

public class MessageFactory {

    @Getter
    private static IMessageProvider provider;
    @Getter
    private static IMessageRenderer renderer;

    static {
        Properties properties = new Properties();
        try(InputStream in = MessageFactory.class.getClassLoader().getResourceAsStream("app.properties")){
            properties.load(in);
            String messageProviderClass = properties.getProperty("messageProviderClass");
            String messageRendererClass = properties.getProperty("messageRendererClass");
            provider = (IMessageProvider) Class.forName(messageProviderClass).newInstance();
            renderer = (IMessageRenderer) Class.forName(messageRendererClass)
                    .getConstructor(IMessageProvider.class).newInstance(provider);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
