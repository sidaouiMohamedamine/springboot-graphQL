package com.example.graphql_project.service;


import com.example.graphql_project.entity.Author;
import com.example.graphql_project.entity.Book;
import com.example.graphql_project.repository.AuthorRepository;
import com.example.graphql_project.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService{

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Book saveBook(BookInput book) {
        Author author = authorRepository.findById(book.id()).orElseThrow(() -> new IllegalArgumentException("author not found"));
        Book b = new Book (book.id(),book.title(), book.description() ,book.pages(),author);
        return bookRepository.save(b);    }

    public record BookInput (Long id,String title, String description, int pages){};


    @Override
    public List<Book> retreiveAllBooks() {
        return null;
    }

    @Override
    public Book retreiveBookByID(Long id) {
        return null;
    }

}
