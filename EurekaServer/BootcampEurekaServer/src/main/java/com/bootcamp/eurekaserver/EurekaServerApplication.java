package com.bootcamp.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * EurekaServerApplication.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    /**
     * EurekaServerApplication.
     */
    public static void main(final String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
