package in.heetvakharia.productservice.services;

import in.heetvakharia.productservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    List<Product> productList = new ArrayList<>();

    public ProductService(){
        productList.add(new Product(1,"Macbook Air",90000));
        productList.add(new Product(2,"Macbook Pro",200000));
        productList.add(new Product(3,"Mac Mini",60000));
        productList.add(new Product(4,"Mac Studio",300000));
        productList.add(new Product(5,"Macbook Neo",70000));

    }

    public List<Product> getProductsAbovePrice(double price) {
        return productList.stream().filter(p -> p.getPrice() > price).toList();
    }

    public List<String> getProductNames() {
        return productList.stream().map(Product::getName).toList();
    }

    public Optional<Product> getProductDetail(long id){
        return productList.stream().filter( p -> p.getId() == id).findFirst();
    }

}
