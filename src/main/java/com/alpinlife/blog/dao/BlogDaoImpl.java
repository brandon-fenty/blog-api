package com.alpinlife.blog.dao;

import com.alpinlife.blog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogDaoImpl implements BlogDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public BlogDaoImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<Post> findAll() {
        return mongoTemplate.findAll(Post.class);
    }

    @Override
    public Post getPostById(String id) {
        return null;
    }

    @Override
    public Post insertPost(Post post) {
        return null;
    }

    @Override
    public boolean deletePost(String id) {
        return false;
    }
}
