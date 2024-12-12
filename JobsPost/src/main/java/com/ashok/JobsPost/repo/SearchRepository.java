package com.ashok.JobsPost.repo;

import com.ashok.JobsPost.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
