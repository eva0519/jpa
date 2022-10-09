package com.sparta.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// extends Timestamped
@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private Long userId;
    private String title;
    private String image;
    private String link;
    private int lprice;
    private int myprice;
}