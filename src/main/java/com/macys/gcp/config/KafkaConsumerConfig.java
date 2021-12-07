package com.macys.gcp.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConsumerConfig {

	// Kafka Consumer configuration - Start
	/*
	 * @Bean public ConsumerFactory<String, String> productConsumer() { // HashMap
	 * to store the configurations Map<String, Object> map = new HashMap<>(); // put
	 * the host IP in the map map.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
	 * "127.0.0.1:9092");
	 * 
	 * // put the group ID of consumer in the map
	 * map.put(ConsumerConfig.GROUP_ID_CONFIG, "id");
	 * map.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
	 * StringDeserializer.class);
	 * map.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
	 * StringDeserializer.class);
	 * 
	 * // return message in JSON formate // return new
	 * DefaultKafkaConsumerFactory<>( map, new StringDeserializer(), new //
	 * JSONDeserializer<>(Student.class)); return new
	 * DefaultKafkaConsumerFactory<>(map, new StringDeserializer(), new
	 * StringDeserializer()); }
	 * 
	 * @Bean public ConcurrentKafkaListenerContainerFactory<String, String>
	 * productListner() { ConcurrentKafkaListenerContainerFactory<String, String>
	 * factory = new ConcurrentKafkaListenerContainerFactory<>();
	 * factory.setConsumerFactory(productConsumer()); return factory; }
	 */

}
