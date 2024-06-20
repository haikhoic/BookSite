// Book.java
package com.vti.finalexam.entity;

import com.vti.finalexam.entity.Author;
import com.vti.finalexam.entity.Publisher;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    private Integer publicationYear;
    private Integer quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Column(length = 50)
    private String genre;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Column(length = 200)
    private String title;

    @Lob
    private String description;

    private String coverImage;
    private Double rentalPrice;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    // getters and setters
}
