package com.maersk.Geography.listener;


import com.google.gson.Gson;
import com.maersk.Geography.model.Geography;
import com.maersk.Geography.model.GeographyAlternateCodes;
import com.maersk.Geography.model.GeographyBDALocationAlternateCodeDetails;
import com.maersk.Geography.model.GeographyBDALocationsDetails;
import com.maersk.Geography.smds.operations.MSK.GeographyEntity;
import com.maersk.Geography.utils.GenreralUtility;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class KafkaAvroMessageConsumer {

  @Autowired
  private MongoTemplate mongoTemplate;

  @KafkaListener(topics = "maersk-test-local-avro-topic", groupId = "maersk-local-avro")
  public void listen(GeographyEntity message) {
    log.info("Received Messasge in group : {}", message);
    //Gson gson = new Gson();
    //Document document = Document.parse(gson.toJson(message));
    Geography g= GenreralUtility.buildFinalObject(message);
    mongoTemplate.save(g,GenreralUtility.GeoTypeMap.get(message.Geography.getGeoType().toString()));
  }


}
