package com.dimasco.sample.kafkaspringexactlyonce.kafka;

import com.dimasco.sample.kafkaspringexactlyonce.processing.model.MessageProcessor;
import com.dimasco.sample.kafkaspringexactlyonce.processing.model.DummyMessage;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {

  @Autowired private MessageProcessor messageProcessor;

  @KafkaListener(topics = "${custom.kafka.topic}")
  public void listen(ConsumerRecord<String, DummyMessage> record, Acknowledgment acknowledgment) {
    messageProcessor.process(record.value());
  }

//  @Bean
//  public RecordFilterStrategy<String, String> recordFilterStrategy() {
//    return record -> !messageProcessor.hasProcessed(record.value());
//  }
}
