package in.heetvakharia.productservice.service;

import in.heetvakharia.productservice.dto.ProductDTO;
import in.heetvakharia.productservice.exception.ResourceNotFoundException;
import in.heetvakharia.productservice.model.Product;
import in.heetvakharia.productservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository ) {
       this.repository = repository;
    }

    public List<Product> getAllProduct() {
        return repository.findAll();
    }

    public Product getProductDetails(long id) {
        return repository.getReferenceById(id);
    }

    public Product save(ProductDTO product) {
        return repository.save(product.toEntity());
    }
}
