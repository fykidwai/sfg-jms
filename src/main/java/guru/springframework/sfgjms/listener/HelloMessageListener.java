package guru.springframework.sfgjms.listener;

import javax.jms.Message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import guru.springframework.sfgjms.config.JmsConfig;
import guru.springframework.sfgjms.model.HelloWorldMessage;

@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listener(@Payload final HelloWorldMessage helloWorldMessage, @Headers final MessageHeaders messageHeaders,
        final Message message) {
        System.out.println("I got a message..!!!");

        System.out.println(helloWorldMessage);
    }

}
