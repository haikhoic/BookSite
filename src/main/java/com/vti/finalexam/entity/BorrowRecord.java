// BorrowRecord.java
package com.vti.finalexam.entity;

import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
public class BorrowRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer borrowId;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime borrowDate;
    private LocalDateTime returnDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // getters and setters
}
