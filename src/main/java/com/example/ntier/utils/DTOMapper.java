package com.example.ntier.utils;

import com.example.ntier.dto.OrderDTO;
import com.example.ntier.dto.ProductDto;
import com.example.ntier.model.Order;
import com.example.ntier.model.Product;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DTOMapper {
    public static ProductDto toProductDTO(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
        return productDto;
    }

    public static Product toProduct(ProductDto productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        return product;
    }

    public static OrderDTO toOrderDTO(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(order.getId());
        orderDTO.setOrderNumber(order.getOrderNumber());

        
    }
    public static Order toOrder(OrderDTO orderDTO) {
        Order order = new Order();
        order.setId(orderDTO.getId());
        order.setOrderNumber(orderDTO.getOrderNumber());
        order.setOrderDate(LocalDate.parse(orderDTO.getFormattedOrderDate()));

        return order;
    }
}
