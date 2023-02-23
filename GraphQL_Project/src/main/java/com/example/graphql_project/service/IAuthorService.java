package com.example.graphql_project.service;


import com.example.graphql_project.entity.Author;
import com.example.graphql_project.entity.Book;

import java.util.List;

public interface IAuthorService {
    //Methode To get All books
    public List<Author> getAuthor();
    public Author getAuthorById(Long id);
   // public Author saveAuthor(Author author);

}
