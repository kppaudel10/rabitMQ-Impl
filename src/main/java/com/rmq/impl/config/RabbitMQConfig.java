package com.rmq.impl.config;

import com.rmq.impl.constant.MessageConstant;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kul.paudel
 * @created at 2024-02-29
 */
@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue queue() {
        return new Queue(MessageConstant.QUEUE_NAME, false);
    }

    @Bean
    public Exchange exchange() {
        return new DirectExchange(MessageConstant.EXCHANGE_KEY);
    }

    @Bean
    public Binding binding(Queue queue, Exchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(MessageConstant.ROUTING_KEY)
                .noargs();
    }
}