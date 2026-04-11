package com.educandoweb.course.services;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Component
public class UserServices {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return  repository.findAll();
    }


    public User finfById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }



}
