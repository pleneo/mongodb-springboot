package com.industriaspleneo.mongoproject.config;

import com.industriaspleneo.mongoproject.entities.Post;
import com.industriaspleneo.mongoproject.entities.User;
import com.industriaspleneo.mongoproject.repositories.PostRepository;
import com.industriaspleneo.mongoproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        postRepository.deleteAll();

        User u1 = new User(null, "Maria Brown", "maria@gmail.com");
        User u2 = new User(null, "Alex Green", "alex@gmail.com");
        User u3 = new User(null, "Bob Grey", "bob@gmail.com");

        Post p1 = new Post(null, Instant.parse("2018-03-21T19:53:07Z"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", u1);
        Post p2 = new Post(null, Instant.parse("2018-03-23T19:53:07Z"), "Bom dia!", "Acordei feliz hoje!", u1);

        userRepository.saveAll(
                Arrays.asList(u1,u2,u3)
        );

        postRepository.saveAll(
                Arrays.asList(p1,p2)
        );
    }
}
