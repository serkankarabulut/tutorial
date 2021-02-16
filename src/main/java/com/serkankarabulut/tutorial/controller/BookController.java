package com.serkankarabulut.tutorial.controller;

import com.serkankarabulut.tutorial.dto.BookCreateRequest;
import com.serkankarabulut.tutorial.dto.BookResponse;
import com.serkankarabulut.tutorial.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController{
    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public ResponseEntity<BookResponse> getBook(@PathVariable Long id) {
        return ResponseEntity.ok().body(bookService.getBookById(id));
    }

    @PostMapping
    public ResponseEntity<BookResponse> createBook(@RequestBody BookCreateRequest book){
        return ResponseEntity.ok().body(bookService.createBook(book));
    }

}