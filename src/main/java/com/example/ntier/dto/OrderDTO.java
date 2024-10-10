package com.example.ntier.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter

public class OrderDTO {

    private Long id;
    private String orderNumber;
    private String formattedOrderDate;
    private Long productId;
    private ProductDto product;
}
