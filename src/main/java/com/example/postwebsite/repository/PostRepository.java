package com.example.postwebsite.repository;

import com.example.postwebsite.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
