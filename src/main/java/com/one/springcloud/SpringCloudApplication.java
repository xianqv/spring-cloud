package com.one.springcloud;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudApplication {

    private  static  final Logger LOGGER= LogManager.getLogger(SpringCloudApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication.class, args);
        LOGGER.info("SpringCloudApplication is running...");
        LOGGER.warn("SpringCloudApplication is running...");
        LOGGER.error("SpringCloudApplication is running...");

    }

}
