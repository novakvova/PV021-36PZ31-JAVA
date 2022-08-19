package org.example;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tblCategories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 200, nullable = false)
    private String name;
    @Column(length = 200)
    private String image;
}
