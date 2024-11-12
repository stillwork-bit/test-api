package com.api.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users_test")
public class UserDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}