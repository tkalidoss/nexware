package com.poc.nexware.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "Palindrome")
public class Palindrome {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "list")
    private String list;

}
