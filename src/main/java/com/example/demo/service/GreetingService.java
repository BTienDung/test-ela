package com.example.demo.service;

import com.example.demo.model.Greeting;

import java.util.List;

public interface GreetingService {
    Iterable<Greeting> getAll();
//    Greeting findOne(String id);
    Greeting create(Greeting greeting);
//    Greeting update(Greeting greeting);
//    List<Greeting> getGreetingByUsername(String username);
//    void delete(String id);
}
