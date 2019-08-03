package com.alpinlife.blog.dao;

import com.alpinlife.blog.model.Post;

import java.util.List;

public interface BlogDao {

    List<Post> findAll();

    Post getPostById(String id);

    Post insertPost(Post post);

    boolean deletePost(String id);
}
