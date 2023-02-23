package com.example.graphql_project.controller;


import com.example.graphql_project.entity.Author;
import com.example.graphql_project.service.AuthorServiceImpl;
import com.example.graphql_project.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    private AuthorServiceImpl authorService;

    @QueryMapping
    public List<Author> getAuthor() {
        return authorService.getAuthor();
    }
    @QueryMapping
    public Author getAuthorById(@Argument Long id){
        return authorService.getAuthorById(id);
    }

    @MutationMapping
    public Author saveAuthor(@Argument AuthorServiceImpl.AuthorInput author){
        return authorService.saveAuthor(author);
    }




}
