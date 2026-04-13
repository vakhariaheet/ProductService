package in.heetvakharia.productservice.controllers;

import in.heetvakharia.productservice.dto.ProductDTO;
import in.heetvakharia.productservice.model.Product;
import in.heetvakharia.productservice.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.constraints.*;


import java.util.List;
@RequestMapping("/products")
@RestController
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){
        return ResponseEntity.ok(service.getAllProduct());
    }

    @PostMapping
     public ResponseEntity<Product> addProduct(@Valid @RequestBody ProductDTO dto){
        return ResponseEntity.ok(service.save(dto));
     }

     @GetMapping("/{id}")
    public ResponseEntity<Product> getProductDetails(@PathVariable long id){
        return ResponseEntity.ok(service.getProductDetails(id));
     }

}
