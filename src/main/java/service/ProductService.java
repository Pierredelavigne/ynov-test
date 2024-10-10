package service;

import dto.ProductDto;
import model.Product;

import java.util.List;

public interface ProductService {
    public List<ProductDto> getAllProducts();
    public ProductDto getProductById(Long Id);
    public ProductDto addProduct(ProductDto product);
    public ProductDto updateProduct(ProductDto product);
    public void deleteProduct(Long Id);
}
