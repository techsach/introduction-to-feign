package com.ts.tutorials.feign.intro.services;

import com.ts.tutorials.feign.intro.model.User;
import feign.RequestLine;

import java.util.List;

public interface UserService {

    @RequestLine("GET /users")
    List<User> getUsers();

}
