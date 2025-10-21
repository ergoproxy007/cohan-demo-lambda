package com.cohan.serverless.api.school;

import com.cohan.serverless.api.school.infrastucture.controller.PingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ PingController.class })
public class CohanDemoLambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CohanDemoLambdaApplication.class, args);
	}

}
