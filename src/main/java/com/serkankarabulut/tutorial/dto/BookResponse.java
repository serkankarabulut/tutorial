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
public class BookResponse {
    private Long id;
    private String name;
    private String author;

    public static BookResponse bookToBookResponse(Book book){
        return new BookResponse(book.getId(), book.getName(), book.getAuthor());
    }

}
