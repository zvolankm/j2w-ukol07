package cz.czechitas.java2webapps.ukol8.controller;

import cz.czechitas.java2webapps.ukol8.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @GetMapping("/")
    public ModelAndView seznamVsechPostu() {
        return new ModelAndView("index")
                .addObject("posts", postService.seznamPostu());
    }

    @GetMapping("/post/{slug}")
    public ModelAndView detailPost(@PathVariable String slug) {
        return new ModelAndView("detail")
                .addObject("singlePost", postService.singlePost(slug));
    }
}
