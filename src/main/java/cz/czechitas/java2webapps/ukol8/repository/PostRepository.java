package cz.czechitas.java2webapps.ukol8.repository;

import cz.czechitas.java2webapps.ukol8.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findPostBySlug(String slug);
    Page<Post>findAllByPublishedNotNullAndPublishedIsBeforeOrderByPublished (LocalDate date, Pageable pageable);
}