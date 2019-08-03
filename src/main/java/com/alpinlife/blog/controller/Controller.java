package com.alpinlife.blog.controller;

import com.alpinlife.blog.dao.BlogDao;
import com.alpinlife.blog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private BlogDao blogDao;

    public Controller(BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    @GetMapping
    public List<Post> getAll() {
        return blogDao.findAll();
    }

//    @PostMapping
//    public ResponseEntity<Post> insertPost(@RequestBody Post post) {
//        blogDao.insertPost(post);
//
//
//    }
}
