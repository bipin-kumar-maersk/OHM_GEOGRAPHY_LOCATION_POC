package com.maersk.Geography.service;

import com.maersk.Geography.smds.operations.MSK.GeographyEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
@Slf4j
public class ProducerService {

    @Value("${kafka.topic.name}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, GeographyEntity> kafkaTemplate;

    public void sendMessage(GeographyEntity message) {
        ListenableFuture<SendResult<String, GeographyEntity>> future = kafkaTemplate.send(topicName, message);
        future.addCallback(
                new ListenableFutureCallback<SendResult<String, GeographyEntity>>() {
                    @Override
                    public void onSuccess(SendResult<String, GeographyEntity> result) {
                        log.info(
                                "Sent message=[{}] with offset=[{}]", message, result.getRecordMetadata().offset());
                    }

                    @Override
                    public void onFailure(Throwable ex) {
                        log.info("Unable to send message=[{}] due to : {}", message, ex.getMessage());
                    }
                });
    }
}
