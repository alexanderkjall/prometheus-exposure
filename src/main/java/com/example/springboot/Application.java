package com.example.springboot;

import java.util.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Properties properties = new Properties();

		properties.put("management.endpoints.enabled-by-default", "false");

		properties.put("management.endpoints.web.exposure.include", "prometheus");
		properties.put("management.endpoint.prometheus.enabled", "true");
		properties.put("management.metrics.export.prometheus.enabled", "true");

		SpringApplication application = new SpringApplication(Application.class);

		application.setDefaultProperties(properties);

		application.run(args);
	}


}
