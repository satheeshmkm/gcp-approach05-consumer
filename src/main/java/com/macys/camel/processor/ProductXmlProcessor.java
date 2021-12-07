package com.macys.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.macys.gcp.processor.FileProcessor;

public class ProductXmlProcessor implements Processor {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductXmlProcessor.class);
	
	@Autowired
	private FileProcessor fileProcessor;

	@Override
	public void process(Exchange exchange) throws Exception {
		String stepxml= exchange.getIn().getBody(String.class);
		JSONArray jsonProducts = fileProcessor.convertToJSONs(stepxml);
		LOGGER.info("converting to JSONArray completed");
		exchange.getIn().setBody(jsonProducts);
		
		
	}
	

}
