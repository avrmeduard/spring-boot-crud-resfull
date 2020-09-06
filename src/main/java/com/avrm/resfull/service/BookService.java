package com.avrm.resfull.service;

import com.avrm.resfull.model.Book;
import com.avrm.resfull.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;


    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public List<Book> saveBooks(List<Book> books) {
        return repository.saveAll(books);
    }

    public List<Book> getBooks() {
        return repository.findAll();
    }

    public Book getBookById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Book getBookByName(String name) {
        return repository.findByName(name);
    }

    public String deleteBook(int id) {
        repository.deleteById(id);

        return "Book whit id "+id+" removed";
    }





}
