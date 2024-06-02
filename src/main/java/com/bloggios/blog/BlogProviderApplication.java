package com.bloggios.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = {
        "com.bloggios.blog",
        "com.bloggios.authenticationconfig",
        "com.bloggios.elasticsearch.configuration"
})
@EnableEurekaClient
@EnableAsync
public class BlogProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogProviderApplication.class, args);
    }

}
