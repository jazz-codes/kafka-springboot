package org.sid.demospringcloudstreamskafka.services;


import org.sid.demospringcloudstreamskafka.entities.PageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.springframework.integration.graph.LinkNode.Type.input;

@Service
public class PageEventService {



    @Bean
    public Consumer<PageEvent> pageEventConsumer(){
        return (input)->{
        System.out.println("************************************");
        System.out.println(input.toString());
        System.out.println("************************************");
        };
    }
    public Supplier<PageEvent> pageEventSupplier(){

        return () ->  new PageEvent(
                Math.random()>0.5?"P1":"P2",
                Math.random()>0.5?"U1":"U2",
                new Date(),
                new Random().nextInt(9000));
    }

}

