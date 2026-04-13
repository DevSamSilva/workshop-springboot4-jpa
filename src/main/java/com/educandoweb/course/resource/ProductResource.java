package com.educandoweb.course.resource;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.ProductServices;
import com.educandoweb.course.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //requisições http(json)
@RequestMapping(value = "/products") //define o caminho(endpoint)
public class ProductResource {

    @Autowired //injeção de dependencia
    private ProductServices services;

    @GetMapping //busca dados
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = services.finfById(id);
        return ResponseEntity.ok().body(obj);
    }
}
