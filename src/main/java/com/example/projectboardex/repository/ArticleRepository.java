package com.example.projectboardex.repository;

import com.example.projectboardex.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}