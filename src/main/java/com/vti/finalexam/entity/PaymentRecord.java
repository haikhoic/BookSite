// PaymentRecord.java
package com.vti.finalexam.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class PaymentRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double amount;
    private LocalDateTime paymentDate;

    @ManyToOne
    @JoinColumn(name = "borrow_id")
    private BorrowRecord borrowRecord;

    // getters and setters
}
