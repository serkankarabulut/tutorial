package com.serkankarabulut.tutorial.repository;

import com.serkankarabulut.tutorial.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
