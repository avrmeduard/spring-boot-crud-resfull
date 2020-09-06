package com.avrm.resfull.controller;

import com.avrm.resfull.model.Book;
import com.avrm.resfull.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return service.saveBook(book);
    }

    @PostMapping("/addBooks")
    public List<Book> addBook(@RequestBody List<Book> books) {
        return service.saveBooks(books);
    }

    public List<Book> findAllBooks() {
        return service.getBooks();
    }


}
