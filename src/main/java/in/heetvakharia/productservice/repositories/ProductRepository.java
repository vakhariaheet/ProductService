package in.heetvakharia.productservice.repositories;

import in.heetvakharia.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
