package com.serkankarabulut.tutorial.service;

import com.serkankarabulut.tutorial.dto.BookCreateRequest;
import com.serkankarabulut.tutorial.dto.BookResponse;

public interface BookService {

    public BookResponse getBookById(Long id);

    public BookResponse createBook(BookCreateRequest book);    
}
