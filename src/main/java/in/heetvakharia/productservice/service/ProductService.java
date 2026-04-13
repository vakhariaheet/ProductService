package in.heetvakharia.productservice.service;

import in.heetvakharia.productservice.dto.ProductDTO;
import in.heetvakharia.productservice.exception.ResourceNotFoundException;
import in.heetvakharia.productservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    List<Product> productList = new ArrayList<>();
    long lastId;

    public ProductService() {
        productList.add(new Product(1, "Macbook Air", 90000));
        productList.add(new Product(2, "Macbook Pro", 200000));
        productList.add(new Product(3, "Mac Mini", 60000));
        productList.add(new Product(4, "Mac Studio", 300000));
        productList.add(new Product(5, "Macbook Neo", 70000));
        lastId = 5;
    }

    public List<Product> getAllProduct() {
        return productList;
    }

    public Product getProductDetails(long id) {
        return productList.stream().filter(p -> p.getId() == id).findFirst().orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    public Product save(ProductDTO product) {
        lastId++;
        Product newProduct = new Product(lastId, product.getName(), product.getPrice());
        productList.add(newProduct);
        return newProduct;
    }


}
