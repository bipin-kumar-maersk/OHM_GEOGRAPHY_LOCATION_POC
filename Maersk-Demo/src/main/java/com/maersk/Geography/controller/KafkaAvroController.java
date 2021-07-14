package com.maersk.Geography.controller;



import com.maersk.Geography.service.ProducerService;
import com.maersk.Geography.smds.operations.MSK.GeographyEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.maersk.Geography.model.Person;

@RestController
@RequestMapping("/api")
@Slf4j
public class KafkaAvroController {

    @Autowired
    ProducerService producerService;

    @PostMapping(value = "/send/avro/geography/info" )
    public String kafkaMessage(@RequestBody GeographyEntity message) {
        log.info("message recieved from payload" +message);
        producerService.sendMessage(message);
        return "Success";
    }
    @PostMapping(value = "/send/avro/geography/test")
    public String kafkaMessageTest(@RequestBody Person person) {
        log.info("message recieved from payload" +person);
        return "Success";
    }
}
