// Publisher.java
package com.vti.finalexam.entity;


import jakarta.persistence.*;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer publisherId;

    @Column(nullable = false, length = 100)
    private String name;

    private String address;
    private String phone;

    // getters and setters
}
