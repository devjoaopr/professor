package br.com.amanda.ifruitapp.service;

import br.com.amanda.ifruitapp.entity.Product;
import br.com.amanda.ifruitapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product searchById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }
}
