package com.educandoweb.course.resource;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.CategoryServices;
import com.educandoweb.course.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //requisições http(json)
@RequestMapping(value = "/categories") //define o caminho(endpoint)
public class CategoryResource {

    @Autowired //injeção de dependencia
    private CategoryServices services;

    @GetMapping //busca dados
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = services.finfById(id);
        return ResponseEntity.ok().body(obj);
    }
}
