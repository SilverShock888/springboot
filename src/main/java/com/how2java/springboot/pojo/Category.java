package com.how2java.springboot.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "category_")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
