package com.macys.gcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.macys" })
public class GcpApproach05Application {

	public static void main(String[] args)  {

		 SpringApplication.run(GcpApproach05Application.class, args);
		}
}
