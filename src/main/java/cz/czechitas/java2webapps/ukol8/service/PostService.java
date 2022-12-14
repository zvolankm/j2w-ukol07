package cz.czechitas.java2webapps.ukol8.service;

import cz.czechitas.java2webapps.ukol8.entity.Post;
import cz.czechitas.java2webapps.ukol8.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.time.LocalDate;


@Service
public class PostService {
    private final PostRepository postRepository;


    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    public Page<Post> seznamPostu() {
        return postRepository.findAllByPublishedNotNullAndPublishedIsBeforeOrderByPublished(LocalDate.now(), PageRequest.of(0, 20));
    }
    public Post singlePost(String slug) {
        return postRepository.findPostBySlug(slug);
    }

}
