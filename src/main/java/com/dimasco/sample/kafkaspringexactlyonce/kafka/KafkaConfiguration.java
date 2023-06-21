package com.dimasco.sample.kafkaspringexactlyonce.kafka;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.ConcurrentKafkaListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.kafka.transaction.KafkaTransactionManager;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfiguration {

//  @Autowired private ConsumerFactory<Object, Object> kafkaConsumerFactory;

//  @Autowired private KafkaTransactionManager<Object, Object> kafkaTransactionManager;
//
//  @Bean
//  public ConcurrentKafkaListenerContainerFactory<Object, Object> kafkaListenerContainerFactory(
//      ConcurrentKafkaListenerContainerFactoryConfigurer configurer) {
//    ConcurrentKafkaListenerContainerFactory<Object, Object> factory =
//        new ConcurrentKafkaListenerContainerFactory<>();
//    configurer.configure(factory, kafkaConsumerFactory);
//    factory.getContainerProperties().setAckMode(ContainerProperties.AckMode.MANUAL_IMMEDIATE);
//    factory.getContainerProperties().setTransactionManager(kafkaTransactionManager);
//    return factory;
//  }
//
//  @Bean
//  public KafkaTransactionManager<String, String> kafkaTransactionManager(
//      ProducerFactory<String, String> producerFactory) {
//    return new KafkaTransactionManager<>(producerFactory);
//  }
//
//  @Bean
//  public ProducerFactory<Object, Object> producerFactory() {
//    return new DefaultKafkaProducerFactory<>(producerConfigs());
//  }

//  @Bean
//  public Map<String, Object> producerConfigs() {
//    Map<String, Object> props = new HashMap<>();
//    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//    props.put(ProducerConfig.RETRIES_CONFIG, 0);
//    props.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
//    props.put(ProducerConfig.LINGER_MS_CONFIG, 1);
//    props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
//    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//    return props;
//  }
}
