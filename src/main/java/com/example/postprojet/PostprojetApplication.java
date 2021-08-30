package com.example.postprojet;

import com.example.postprojet.entites.Post;
import com.example.postprojet.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PostprojetApplication implements CommandLineRunner {

    @Autowired
    PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(PostprojetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        postRepository.save(new Post(null,"dddd","rrrrrrrrr","amine",new Date(),"dddd"));
        postRepository.save(new Post(null,"kkiki","dfvf","ayoub",new Date(),"dddd"));
        postRepository.save(new Post(null,"lolpm","eeee","omayma",new Date(),"dddd"));

    }
}
