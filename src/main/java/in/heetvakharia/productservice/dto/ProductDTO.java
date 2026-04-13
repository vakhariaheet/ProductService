package in.heetvakharia.productservice.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;


@Getter
public class ProductDTO {
    @NotNull(message = "Name is required")
    private String name;

    @Min(value = 1, message = "Price should be more than 0")
    private double price;

}
