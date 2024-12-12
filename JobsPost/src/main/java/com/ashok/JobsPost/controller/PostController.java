package com.ashok.JobsPost.controller;

import com.ashok.JobsPost.model.Post;
import com.ashok.JobsPost.repo.PostRepository;
import com.ashok.JobsPost.repo.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    SearchRepository searchRepository;

    @ApiIgnore
    @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts()
    {
        return postRepository.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(String text)
    {
        return searchRepository.findByText(text);
    }

    @PostMapping("/post")
    public Post addPosts(@RequestBody Post post)
    {
        return postRepository.save(post);
    }
}
