// User.java
package com.vti.finalexam.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(length = 100)
    private String fullName;

    @Column(length = 100)
    private String email;

    @Column(length = 100)
    private String password;

    // getters and setters
}
