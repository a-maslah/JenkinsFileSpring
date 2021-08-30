package com.example.postprojet.Controller;

import com.example.postprojet.DTO.PostDTO;
import com.example.postprojet.Service.PostInterface;
import com.example.postprojet.entites.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostInterface postInterface;

    @GetMapping("/poststest")
    public List<PostDTO> getAllPost(){
        return postInterface.getPosts();
    }

    @RequestMapping(value = "/post/{id}",method = RequestMethod.GET)
    public PostDTO getOne(@PathVariable("id") Long id){
        return postInterface.getOnePost(id);
    }

}
