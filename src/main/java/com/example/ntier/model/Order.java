package com.example.ntier.model;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;

@Entity
@Table(name="orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    private LocalDate orderDate;

    @ManyToOne
    private Product product;

}