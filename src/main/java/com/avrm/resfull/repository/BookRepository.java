package com.avrm.resfull.repository;


import com.avrm.resfull.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findByName(String name);
}
