package smart.ad.founder.demo.application.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // chat client will use this to connect to the server
//        registry.addEndpoint("/kafka-chat").setAllowedOrigins("*");
//        registry.addEndpoint("/kafka-chat").setAllowedOrigins("*").withSockJS();
        registry.addEndpoint("/kafka-chat");
        registry.addEndpoint("/kafka-chat").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");

//        registry.setApplicationDestinationPrefixes("/");
//        registry.setApplicationDestinationPrefixes("/sendMessage");
//        registry.setApplicationDestinationPrefixes("/api/kafkaMessages");
//        registry.setApplicationDestinationPrefixes("/app/api/kafkaMessages/sendMessage");
//        registry.setApplicationDestinationPrefixes("/app/sendMessage");

//        registry.enableSimpleBroker("/topic/");
//        registry.enableSimpleBroker("/topic");
//        registry.enableSimpleBroker("/topic/group");
    }

}
