package com.serkankarabulut.tutorial.service;

import java.util.Optional;

import com.serkankarabulut.tutorial.dto.BookCreateRequest;
import com.serkankarabulut.tutorial.dto.BookResponse;
import com.serkankarabulut.tutorial.exception.RecordNotFoundException;
import com.serkankarabulut.tutorial.model.Book;
import com.serkankarabulut.tutorial.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServicempl implements BookService{
    
    @Autowired
    private BookRepository repository;

    @Override
    public BookResponse getBookById(Long id){
        Optional<Book> dbResult = repository.findById(id);
        return dbResult.map(BookResponse::bookToBookResponse).orElseThrow(()->new RecordNotFoundException("Book Not Found"));
    }

	@Override
	public BookResponse createBook(BookCreateRequest book) {
		Book newBook = book.convertToBook();
        return BookResponse.bookToBookResponse(repository.save(newBook));
	}
}
