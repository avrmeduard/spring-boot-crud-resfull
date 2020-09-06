package com.avrm.resfull.service;

import com.avrm.resfull.model.Book;
import com.avrm.resfull.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;


    public Book saveBook(Book book) {
        return repository.save(book);
    }


}
