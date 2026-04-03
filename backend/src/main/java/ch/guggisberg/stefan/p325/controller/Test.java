package ch.guggisberg.stefan.p325.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class Test {

    @Value("${app.cors.allowed-origins}")
    private String allowedOrigins;

    @GetMapping
    public ResponseEntity<Hallo> test() {

        Hallo hello = new Hallo();
        hello.text=allowedOrigins;

        return new ResponseEntity<>(hello, HttpStatus.OK);
    }



}
