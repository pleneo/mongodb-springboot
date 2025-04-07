package com.industriaspleneo.mongoproject.services;

import com.industriaspleneo.mongoproject.entities.User;
import com.industriaspleneo.mongoproject.repositories.UserRepository;
import com.industriaspleneo.mongoproject.services.exceptions.ObjectNotFoundException;
import com.sun.jdi.ObjectCollectedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object with id = " + id + " not found."));
    }
}
