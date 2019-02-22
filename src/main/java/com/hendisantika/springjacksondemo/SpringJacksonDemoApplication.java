package com.hendisantika.springjacksondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJacksonDemoApplication {

    public static final String DATE_TIME_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssXXX";

    public static void main(String[] args) {
        SpringApplication.run(SpringJacksonDemoApplication.class, args);
    }

}
