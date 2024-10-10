package com.example.ntier.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class ProductDto {
    public Long id;
    public String name;
    public double price;
}
