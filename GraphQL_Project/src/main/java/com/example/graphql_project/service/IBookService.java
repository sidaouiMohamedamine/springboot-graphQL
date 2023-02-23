package com.example.graphql_project.service;


import com.example.graphql_project.entity.Book;

import java.util.List;

public interface IBookService {

    //Methode to create a new book

    Book saveBook(BookServiceImpl.BookInput book);

    //Methode To get All books
    public List<Book> getAllBooks();
    //Methode to get a book by id
    public Book retreiveBookByID(Long id);
}
