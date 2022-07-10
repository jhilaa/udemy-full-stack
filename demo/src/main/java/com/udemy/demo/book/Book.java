package com.udemy.demo.book;

import com.udemy.demo.category.Category;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Book {
    @NotBlank
    private String title;
    private Category category;
    private BookStatus status;

    public Book (String title, Category category) {
        this.title = title;
        this.category = category;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BookStatus getStatus() { return status; }

    public void setStatus(BookStatus status) { this.status = status;  }

    @Override
    public String toString() {
        return this.title + " / " + this.category;
    }
}
