package com.back.domain.post.post.repository;

import com.back.domain.post.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

// 내부적으로 빈으로 처리됨
public interface PostRepository extends JpaRepository<Post, Integer> {
}