package com.udemy.demo.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping(value="/users")
    public ResponseEntity addUser(User user) {
        User userTest = new User("Arsène", "Lupin", "herlock@Sholmes.net", "mleblanc");  //pour tester le endpoint
        return new ResponseEntity(userTest, HttpStatus.CREATED);
    }
}
