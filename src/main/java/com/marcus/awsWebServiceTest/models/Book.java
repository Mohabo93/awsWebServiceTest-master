package com.marcus.awsWebServiceTest.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "books")
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @MongoId
    private String id;
    private String title;
    private String author;
}
