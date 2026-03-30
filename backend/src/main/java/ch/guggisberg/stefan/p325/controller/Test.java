package ch.guggisberg.stefan.p325.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/users")
public class Test {

    @GetMapping
    public ResponseEntity<Hallo> test() {

        Hallo hello = new Hallo();
        hello.text="hello world3";

        return new ResponseEntity<>(hello, HttpStatus.OK);
    }



}
