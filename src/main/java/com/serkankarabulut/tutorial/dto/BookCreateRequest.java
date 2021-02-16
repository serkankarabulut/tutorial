package com.serkankarabulut.tutorial.dto;

import com.serkankarabulut.tutorial.model.Book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookCreateRequest {
    private String name;
    private String author;

    public Book convertToBook(){
        Book book = new Book();
        book.setName(this.name);
        book.setAuthor(this.author);
        return book;
    } 
}
