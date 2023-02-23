package com.example.graphql_project.controller;


import com.example.graphql_project.entity.Book;
import com.example.graphql_project.repository.BookRepository;
import com.example.graphql_project.service.BookServiceImpl;
import com.example.graphql_project.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @MutationMapping
    public Book saveBook(@Argument BookServiceImpl.BookInput book) {
        return  bookService.saveBook(book);

    }
}
