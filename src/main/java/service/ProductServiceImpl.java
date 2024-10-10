package service;

import dto.ProductDto;
import model.Product;
import repository.ProductRepository;
import utils.DTOMapper;
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
        return DTOMapper.toProductDTO(productRepository.findById(id).get());
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
        productRepository.deleteById(id);
    }
}
