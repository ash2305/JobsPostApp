package com.ashok.JobsPost.repo;

import com.ashok.JobsPost.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
