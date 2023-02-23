package com.example.graphql_project.service;

import com.example.graphql_project.entity.Author;
import com.example.graphql_project.entity.Book;
import com.example.graphql_project.exception.NotFoundException;
import com.example.graphql_project.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Lazy
public class AuthorServiceImpl implements IAuthorService{
    @Autowired
    private AuthorRepository authorRepository;


    @Override
    public List<Author> getAuthor() {
        return authorRepository.findAll();
    }
    @Override
    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElseThrow(()->new NotFoundException("we didn't found the user"));
    }


    public Author saveAuthor(AuthorServiceImpl.AuthorInput author) {
        Author author1=new Author(author.id(),author.name());
        return  authorRepository.save(author1);
    }
    public record AuthorInput (Long id,String name){};


}
