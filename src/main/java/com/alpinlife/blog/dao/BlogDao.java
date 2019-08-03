package com.alpinlife.blog.dao;

import com.alpinlife.blog.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogDao extends MongoRepository<Post, String> {
}
