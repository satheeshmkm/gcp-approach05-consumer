package com.macys.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.macys.camel.processor.ProductFileProcessor;
import com.macys.camel.processor.ProductJSONsProcessor;
import com.macys.camel.processor.ProductXmlProcessor;

@Component
public class MacysRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		// Kafka Consumer
		/*from("${kafka.inbound.topic}"+"${kafkaConsumerProperties}")*/
		from("kafka:product_topic?brokers=localhost:9092")
                .log("Message received from Kafka : ${body}")
               // .convertBodyTo(getClass(), null)
                .process(new ProductXmlProcessor())
                .to("direct:pubsubPublish")
                .process(new ProductFileProcessor())
                .to("google-storage://macysbucket");
    
		from("direct:pubsubPublish")
		 	.process(new ProductJSONsProcessor())
			.to("google-pubsub://macysproject:mydftopic");
		

	}

}
