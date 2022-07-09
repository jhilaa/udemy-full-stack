package com.udemy.demo.book;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class BookController {
    @GetMapping(value="/books")
    public ResponseEntity listBooks(){
        Book book = new Book();
        book.setTitle("MyBook");
        book.setCategory(new Category("MyCategory"));

        return new ResponseEntity(Arrays.asList(book), HttpStatus.OK);
    }

    @PostMapping(value="/books")
    public ResponseEntity addBook(Book book){
        //TODO persist
        return new ResponseEntity(book, HttpStatus.CREATED);
    }

    @DeleteMapping(value="/books/{bookId}")
    public ResponseEntity deleteBook (@PathVariable("bookID") String bookId){
        //TODO delete depuis bookId
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping(value="/books/{bookId}")
    public ResponseEntity updateBook (@PathVariable("bookID") String bookId, Book book){
        //TODO récup du book (nelle version) et update depuis bookId
        return new ResponseEntity(book, HttpStatus.OK);
    }
}
