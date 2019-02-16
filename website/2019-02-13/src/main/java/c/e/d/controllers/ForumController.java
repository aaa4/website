package c.e.d.controllers;

import c.e.d.forumElements.Post;
import c.e.d.services.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ForumController {

    @Autowired
    public void setDevService(DevService devService) {
        this.devService = devService;
    }

    private DevService devService;

    @GetMapping("/posts")
    public String getAllPosts(Model model) {

        model.addAttribute("posts", devService.getPosts());
        model.addAttribute("newPost", new Post());
       /* model.addAttribute("atr2", "Аттрибут модели2");
        model.addAttribute("atr3", "Аттрибут модели3");*/


        return "forumMain";
    }

    @PostMapping("/addPost")
    public String addNewPost(@ModelAttribute Post newPost) {
        devService.addPost(newPost);
        return "redirect:/posts";
    }
}
