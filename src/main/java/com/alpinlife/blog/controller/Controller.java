package com.alpinlife.blog.controller;

import com.alpinlife.blog.dao.BlogDao;
import com.alpinlife.blog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
