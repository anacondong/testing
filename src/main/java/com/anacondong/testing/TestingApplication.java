package com.anacondong.testing;

import com.anacondong.testing.config.SampleConfigurationProperties;
import com.anacondong.testing.services.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TestingApplication implements CommandLineRunner {

	// Simple example shows how a command line spring application can execute an
	// injected bean service. Also demonstrates how you can use @Value to inject
	// command line args ('--name=whatever') or application properties

	@Autowired
	HelloWorldService helloWorldService;

	@Autowired
	SampleConfigurationProperties sampleConfigurationProperties;

	public static void main(String[] args) {
		log.info("Starting Application :");
		SpringApplication.run(TestingApplication.class, args).close();
		log.info("Stop Application :");
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Get value helloWorldService" +this.helloWorldService.getHelloMessage());
		log.info("Get value sampleConfigurationProperties" +this.sampleConfigurationProperties.getName());
	}
}
