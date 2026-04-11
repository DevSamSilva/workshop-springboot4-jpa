package com.educandoweb.course.services;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderServices {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return  repository.findAll();
    }


    public Order finfById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }



}
