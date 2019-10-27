package com.wanderclust.blog.dao;

import com.wanderclust.blog.model.Post;

import java.util.List;

public interface BlogDao {

    List<Post> findAll();

    Post getPostById(String id);

    Post insertPost(Post post);

    boolean deletePost(String id);
}
