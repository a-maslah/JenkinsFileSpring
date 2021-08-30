package com.example.postprojet.Service;

import com.example.postprojet.DTO.PostDTO;
import com.example.postprojet.entites.Post;

import java.util.List;


public interface PostInterface {

    public List<PostDTO> getPosts();

    public PostDTO getOnePost(Long id);
}
