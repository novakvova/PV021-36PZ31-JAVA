package org.example;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tbl_products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 200, nullable = false)
    private String name;
    private double price;
    @ManyToOne()
    @JoinColumn(name="category_id", nullable = false)
    private Category category;
}
