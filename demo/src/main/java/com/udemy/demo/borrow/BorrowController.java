package com.udemy.demo.borrow;

import com.udemy.demo.category.Category;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
public class BorrowController {

    @GetMapping(value = "/borrows")
    public ResponseEntity getMyBorrows() {
        //TODO
        Borrow borrow = new Borrow();
        borrow.setAskDate(LocalDate.now());
        return new ResponseEntity(borrow, HttpStatus.OK);
    }

    @PostMapping(value = "/borrows/{bookId}")
    public ResponseEntity createBorrow(@PathVariable("bookId") String bookId) {
        //TODO
        Borrow borrow = new Borrow();
        return new ResponseEntity(borrow, HttpStatus.CREATED);
    }


    @DeleteMapping(value="/borrows/{borrowId}")
    public ResponseEntity deleteBorrow(@PathVariable("borrowId") String borrowId){
        //TODO
        return new ResponseEntity(HttpStatus.OK);
    }


}
