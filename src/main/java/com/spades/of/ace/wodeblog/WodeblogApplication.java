package com.spades.of.ace.wodeblog;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class WodeblogApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(WodeblogApplication.class).run(args);
    }
}
