package com.maersk.Geography.listener;


import com.maersk.Geography.smds.operations.MSK.GeographyEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaAvroMessageConsumer {

  @Autowired
  private MongoTemplate mongoTemplate;

  @KafkaListener(topics = "maersk-test-local-avro-topic", groupId = "maersk-local-avro")
  public void listen(GeographyEntity message) {
    log.info("Received Messasge in group : {}", message);
    mongoTemplate.save(message,message.Geography.getGeoType().toString());
  }

}
