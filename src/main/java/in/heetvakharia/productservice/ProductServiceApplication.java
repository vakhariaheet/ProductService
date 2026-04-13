package in.heetvakharia.productservice;

import in.heetvakharia.productservice.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {
        Product product1 = new Product(1,"Laptop",45000);
        System.out.println("Product Name: "+product1.getName());
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
