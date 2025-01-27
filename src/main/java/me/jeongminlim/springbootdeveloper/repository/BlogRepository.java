package me.jeongminlim.springbootdeveloper.repository;

import me.jeongminlim.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
