package com.udemy.demo.category;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CategoryController {

    @PostMapping("/categories")
    public ResponseEntity createCategory (@RequestParam("category") Category category) {
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value = "/categories")
    public ResponseEntity getCategories() {
        //TODO
        ArrayList<Category> listCategories = new ArrayList<Category>();
        listCategories.add(new Category("sf"));
        listCategories.add(new Category("polar"));
        return new ResponseEntity(listCategories.toString(),  HttpStatus.OK);
    }

    @GetMapping("/categories/{bookId}")
    public ResponseEntity getCategory (@PathVariable("bookId") String bookID) {
        //TODO
        return new ResponseEntity(new Category("Essai"), HttpStatus.OK);
    }

}
