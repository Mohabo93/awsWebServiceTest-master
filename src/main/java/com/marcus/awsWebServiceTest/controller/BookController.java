package com.marcus.awsWebServiceTest.controller;

import com.marcus.awsWebServiceTest.models.Book;
import com.marcus.awsWebServiceTest.repository.MongoRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
@AllArgsConstructor

public class BookController {
    @Autowired
    private MongoRepository mongoRepository;

    @GetMapping("")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> books = mongoRepository.findAll();

        return ResponseEntity.status(200).body(books);
    }

    @PostMapping("")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book respBook = mongoRepository.save(book);

        return ResponseEntity.status(201).body(respBook);
    }
}