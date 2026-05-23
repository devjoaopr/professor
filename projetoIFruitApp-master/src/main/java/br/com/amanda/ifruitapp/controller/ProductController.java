package br.com.amanda.ifruitapp.controller;

import br.com.amanda.ifruitapp.entity.Product;
import br.com.amanda.ifruitapp.entity.User;
import br.com.amanda.ifruitapp.service.ProductService;
import br.com.amanda.ifruitapp.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product returnProductById(@PathVariable Long id) {
        return productService.searchById(id);
    }

    @PostMapping("/create")
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

}