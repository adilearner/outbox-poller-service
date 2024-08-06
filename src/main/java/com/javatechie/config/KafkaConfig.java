package com.javatechie.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
    @Value("${order.poller.topic.name}")
    private String topicName;

    //Asking kafka to create new topic,creating bean of NewTopic and then just return new topic
    // with name and partition details passed,on application startup if it founds that kafka broker
    // and zookeeper is up and running then the below bean method will execute and create topic with
    //the given name
    @Bean
    public NewTopic createTopic(){
        return new NewTopic(topicName,3,(short)1);
    }
}
