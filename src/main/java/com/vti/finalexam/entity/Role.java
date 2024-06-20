// Role.java
package com.vti.finalexam.entity;


import jakarta.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleName roleName;

    public enum RoleName {
        admin, user
    }

    // getters and setters
}
