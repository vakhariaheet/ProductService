package in.heetvakharia.productservice;

import in.heetvakharia.productservice.services.ProductService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        System.out.println("All Products: ");
        productService.getProductNames().forEach(System.out::println);
        System.out.println("Products Above 80000: ");
        productService.getProductsAbovePrice(80000).forEach(p -> System.out.println(p.getName()));
        productService.getProductDetail(4).ifPresent(p -> System.out.println("Product with Id 4: "+ p.getName()));
    }

}
