package com.ts.tutorials.feign.intro;

import com.ts.tutorials.feign.intro.services.UserService;
import feign.Feign;
import feign.jackson.JacksonDecoder;

public class Main {

    public static void main(String[] args) {
UserService userService = Feign.builder()
        .decoder(new JacksonDecoder())
        .target(UserService.class, "https://jsonplaceholder.typicode.com");
System.out.println(userService.getUsers());
    }

}
