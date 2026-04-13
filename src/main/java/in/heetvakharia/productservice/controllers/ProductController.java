package in.heetvakharia.productservice.controllers;

import in.heetvakharia.productservice.model.Product;
import in.heetvakharia.productservice.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service){
        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getAllProduct();
    }
}
