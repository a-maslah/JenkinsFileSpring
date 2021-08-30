package com.example.postprojet.Service.Impl;

import com.example.postprojet.DTO.PostDTO;
import com.example.postprojet.Service.PostInterface;
import com.example.postprojet.entites.Post;
import com.example.postprojet.repository.PostRepository;
import javafx.geometry.Pos;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.postprojet.util.Utils;

import java.util.List;

@Service
public class PostInterfaceImpl implements PostInterface {

    @Autowired
    PostRepository postRepository;

    private ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<PostDTO> getPosts() {
        Post p = new Post();

        List<PostDTO> posts = Utils.map(modelMapper, postRepository.findAll(), PostDTO.class);
        return posts;
    }


    @Override
    public PostDTO getOnePost(Long id) {
        Post p = postRepository.findById(id).get();
        PostDTO post = new PostDTO();
        post.setAuthor(p.getAuthor());
        post.setTitle(p.getTitle());
        return post;
    }


}
