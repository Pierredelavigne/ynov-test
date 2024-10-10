package model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="orders")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order {
    private Long id;
    private String orderNumber;
    private LocalDate orderDate;

    @ManyToOne
    private Product product;
}
