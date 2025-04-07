package com.industriaspleneo.mongoproject.resources;

import com.industriaspleneo.mongoproject.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity< List<User> > findAll() {
        User u1 = new User("1","Luigi Silva", "luigi@luigi.com");
        User u2 = new User("2", "Mario Silva", "mario@mario.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(u1,u2));
        return ResponseEntity.ok().body(list);
    }
}
