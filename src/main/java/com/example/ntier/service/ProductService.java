package com.example.ntier.service;

import com.example.ntier.dto.ProductDto;

import java.util.List;

public interface ProductService {
    public List<ProductDto> getAllProducts();
    public ProductDto getProductById(Long Id);
    public ProductDto addProduct(ProductDto product);
    public ProductDto updateProduct(ProductDto product);
    public void deleteProduct(Long Id);
}
