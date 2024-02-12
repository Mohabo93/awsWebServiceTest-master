package com.marcus.awsWebServiceTest.repository;


import com.marcus.awsWebServiceTest.models.Book;

public interface MongoRepository extends org.springframework.data.mongodb.repository.MongoRepository<Book, String> {
}
