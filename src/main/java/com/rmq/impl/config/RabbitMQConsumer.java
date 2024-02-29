package com.rmq.impl.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author kul.paudel
 * @created at 2024-02-29
 */
@Component
@RequiredArgsConstructor
public class RabbitMQConsumer {

    @RabbitListener(queues = "message-queue")
    public void receiveMessage(String message) {
        System.out.println("received message: " + message);
    }
}
