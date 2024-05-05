package com.ms.email.consumers;

import com.ms.email.models.dto.request.EmailRequestDto;
import com.ms.email.services.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@SuppressWarnings("unused")
public class EmailConsumers {

    private final EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.template.queue}")
    public void listenEmailQueue(@Payload EmailRequestDto dto){
        emailService.sendSimpleMessage(dto);
    }
}
