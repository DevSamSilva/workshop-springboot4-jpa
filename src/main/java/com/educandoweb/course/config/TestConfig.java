package com.educandoweb.course.config;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired //resolve dependencias
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Clara", "maria@gmail.com", "9999999999", "1234");
        User u2 = new User(null,"Samuel Silva", "samuel@gmail.com", "8888888888", "4321");



        //passa a lista de objetos para o banco de dados
        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
