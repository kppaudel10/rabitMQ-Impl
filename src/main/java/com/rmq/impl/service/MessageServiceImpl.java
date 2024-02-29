package com.rmq.impl.service;

import com.rmq.impl.config.RabbitMQProducer;
import com.rmq.impl.constant.MessageConstant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author kul.paudel
 * @created at 2024-02-29
 */
@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final RabbitMQProducer rabbitMQProducer;

    @Override
    public String sendMessage(String message) {
        rabbitMQProducer.sendMessage(MessageConstant.QUEUE_NAME, MessageConstant.ROUTING_KEY, message);
        return message;
    }
}
