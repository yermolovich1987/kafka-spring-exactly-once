package com.dimasco.sample.kafkaspringexactlyonce.api;

import com.dimasco.sample.kafkaspringexactlyonce.processing.model.DummyMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DummyController {

  private final KafkaTemplate<String, DummyMessage> kafkaTemplate;

  @Autowired
  public DummyController(KafkaTemplate<String, DummyMessage> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  @PostMapping("/send")
  public void sendMessage(@RequestBody DummyMessage message) {
    kafkaTemplate.send("test-topic", message.getUniqueId(), message);
  }
}
