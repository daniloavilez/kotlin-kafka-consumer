package br.com.avilez.KotlinKafkaConsumer

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KotlinConsumer {

    private val logger = LoggerFactory.getLogger(javaClass)

    @KafkaListener(topics = ["simple-message"], groupId = "simple-kotlin-group")
    fun processMessage(message: ConsumerRecord<String, String>) {
        Thread.sleep(50)
        logger.info("got message: {}", message)
    }


}