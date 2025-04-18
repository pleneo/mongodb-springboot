package com.industriaspleneo.mongoproject.repositories;

import com.industriaspleneo.mongoproject.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
