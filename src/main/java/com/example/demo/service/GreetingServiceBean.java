package com.example.demo.service;


import com.example.demo.dao.GreetingRepository;
import com.example.demo.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingServiceBean implements GreetingService {

    @Autowired
    private GreetingRepository repository;

    @Override
    public Iterable<Greeting> getAll() {
        Iterable<Greeting> greetings = repository.findAll();
        return greetings;
    }

//    @Override
//    public Greeting findOne(String id) {
//        return repository.findOne(id);
//    }

    @Override
    public Greeting create(Greeting greeting) {
        return repository.save(greeting);
    }

//    @Override
//    public Greeting update(Greeting greeting) {
//        Greeting persitedGreeting = repository.findOne(greeting.getId());
//        if(persitedGreeting == null) {
//            return null;
//        }
//        return repository.save(greeting);
//    }
//
//    @Override
//    public List<Greeting> getGreetingByUsername(String username) {
//        return repository.findByUsername(username);
//    }
//
//    @Override
//    public void delete(String id) {
//        repository.delete(id);
//    }
}
