package com.spring.boot.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class User implements Serializable {

	private static final long serialVersionUID = 1L;  //<--

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private Long userId;

    private String name;
    private String phone;
    private String email;    
}
