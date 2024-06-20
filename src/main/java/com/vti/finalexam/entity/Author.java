// Author.java
package com.vti.finalexam.entity;

import jakarta.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorId;

    @Column(nullable = false, length = 100)
    private String name;

    // getters and setters
}
