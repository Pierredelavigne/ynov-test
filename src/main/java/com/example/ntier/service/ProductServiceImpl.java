package com.example.ntier.service;

import com.example.ntier.dto.ProductDto;
import com.example.ntier.exception.ResourceNotFoundException;
import com.example.ntier.model.Product;
import com.example.ntier.repository.ProductRepository;
import com.example.ntier.utils.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDto> getAllProducts() {
        // .stream() permet de mettre la liste reçu en 'flux' qui va permettre d'effectuer des modification sur cette liste
        return productRepository.findAll().stream().map(product -> DTOMapper.toProductDTO(product)).toList();
    }

    @Override
    public ProductDto getProductById(Long id) {
        Product product = productRepository.findById(id).
                orElseThrow(()-> new ResourceNotFoundException("Product Not found"));
        return DTOMapper.toProductDTO(product);
    }

    @Override
    public ProductDto addProduct(ProductDto productDTO) {
        Product product = DTOMapper.toProduct(productDTO);
        return DTOMapper.toProductDTO(productRepository.save(product));
    }

    @Override
    public ProductDto updateProduct(ProductDto productDTO) {
        Product product = DTOMapper.toProduct(productDTO);
        return DTOMapper.toProductDTO(productRepository.save(product));    }


    @Override
    public void deleteProduct(Long id) {
        productRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product not found"));
        productRepository.deleteById(id);
    }
}
