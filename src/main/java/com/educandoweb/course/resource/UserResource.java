package com.educandoweb.course.resource;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //requisições http(json)
@RequestMapping(value = "/users") //define o caminho(endpoint)
public class UserResource {

    @GetMapping //busca dados
    public ResponseEntity<User> findAll(){
        User user = new User(null,"Maria","maria@gmail.com","999999", "12345");
        return ResponseEntity.ok().body(user);
    }
}
