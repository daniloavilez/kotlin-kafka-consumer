package br.com.avilez.KotlinKafkaConsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.core.KafkaTemplate

@SpringBootApplication
class KotlinKafkaConsumerApplication

fun main(args: Array<String>) {
	runApplication<KotlinKafkaConsumerApplication>(*args)
}