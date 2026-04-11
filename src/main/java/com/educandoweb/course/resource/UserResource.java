package com.educandoweb.course.resource;

import com.educandoweb.course.services.UserServices;
import com.educandoweb.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //requisições http(json)
@RequestMapping(value = "/users") //define o caminho(endpoint)
public class UserResource {

    @Autowired //injeção de dependencia
    private UserServices services;

    @GetMapping //busca dados
    public ResponseEntity<List<User>> findAll(){
        List<User> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = services.finfById(id);
        return ResponseEntity.ok().body(obj);
    }
}
