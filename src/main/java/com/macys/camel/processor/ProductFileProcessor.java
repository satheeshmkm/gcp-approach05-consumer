package com.macys.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.macys.gcp.processor.FileProcessor;


public class ProductFileProcessor implements Processor {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductFileProcessor.class);
	
	@Autowired
	private FileProcessor fileProcessor;

	@Override
	public void process(Exchange exchange) throws Exception {
		String jsonl =exchange.getIn().getBody(String.class);
		LOGGER.info("converting to JSONLcompleted");
		exchange.getIn().setBody(jsonl);
	}

}
