package com.dimasco.sample.kafkaspringexactlyonce.processing.model;

import com.dimasco.sample.kafkaspringexactlyonce.processing.model.DummyMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MessageProcessor {

  @Autowired private KafkaTemplate<String, DummyMessage> kafkaTemplate;

//  private final Set<DummyMessage> processedMessages = new HashSet<>();

  @Transactional
  public void process(DummyMessage dummyMessage) {
    // Process the message here
    System.out.println("Processing message: " + dummyMessage);
//    processedMessages.add(dummyMessage);
    kafkaTemplate.send("processed-messages", dummyMessage);
  }

//  public boolean shouldProcess(DummyMessage message) {
//    return !processedMessages.contains(message);
//  }
//
//  public boolean hasProcessed(DummyMessage message) {
//    return processedMessages.contains(message);
//  }
}
