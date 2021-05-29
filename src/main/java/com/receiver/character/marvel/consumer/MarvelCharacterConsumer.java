package com.receiver.character.marvel.consumer;

import com.character.marvel.model.MarvelCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

@Service
public class MarvelCharacterConsumer {


    @KafkaListener(topics = "marvel-character", groupId = "marvel", containerFactory = "kafkaListenerContainerFactory")
    public void listenGroupFoo(MarvelCharacter character) {
        System.out.println("Received Message in group foo: " + character);




    }
}
