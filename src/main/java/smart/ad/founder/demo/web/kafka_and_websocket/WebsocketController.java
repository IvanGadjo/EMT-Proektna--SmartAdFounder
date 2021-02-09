package smart.ad.founder.demo.web.kafka_and_websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import smart.ad.founder.demo.domain.model.DTOs.KafkaFoundAdMessage;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class WebsocketController {


    // FIXME: Ova mora da proraboti
    // next: Scheduled prakjanje poraki od kafka koi se citaat od foundAdverts (metod od kafka controller)

    @MessageMapping("/hello")
    @SendTo("/topic/group")
    public KafkaFoundAdMessage broadcastGroupMessage(@Payload KafkaFoundAdMessage message) {
        //Sending this message to all the subscribers
        System.out.println("-------------------- SENDING VIA WEBSOCKET");
        return message;
    }
}
