package com.github.williamdlm.hrapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class HrApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrApiGatewayApplication.class, args);
    }

}
