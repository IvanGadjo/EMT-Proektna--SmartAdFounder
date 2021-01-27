package smart.ad.founder.demo.web.kafka_and_websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import smart.ad.founder.demo.domain.model.DTOs.KafkaFoundAdMessage;

@Controller
public class WebsocketController {


    @MessageMapping("/kafka-chat")
    @SendTo("/topic/group")
    public KafkaFoundAdMessage broadcastGroupMessage(@Payload KafkaFoundAdMessage message) {
        //Sending this message to all the subscribers
        System.out.println("-------------------- SENDING VIA WEBSOCKET");
        return message;
    }
}
