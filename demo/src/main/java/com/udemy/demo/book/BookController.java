package com.udemy.demo.book;

import com.udemy.demo.category.Category;
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

    @GetMapping(value="/books/{bookId}/status")
    public ResponseEntity bookStatus(){
        Book book = new Book();
        book.setTitle("MyBook");
        book.setCategory(new Category("MyCategory"));
        book.setStatus(BookStatus.FREE);
        return new ResponseEntity(book.getStatus(), HttpStatus.OK);
    }

    @PostMapping(value="/books")
    public ResponseEntity addBook(@RequestBody Book book){
        //TODO persist
        return new ResponseEntity(book.toString(), HttpStatus.CREATED);
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
