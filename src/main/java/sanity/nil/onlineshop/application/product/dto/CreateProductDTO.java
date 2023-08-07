package sanity.nil.onlineshop.application.product.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import sanity.nil.onlineshop.application.product.dto.discount.CreateDiscountDTO;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
public class CreateProductDTO {

    @JsonProperty(value = "description", required = true)
    public String description;

    @JsonProperty(value = "name", required = true)
    public String name;

    @JsonProperty(value = "product_subtype_id", required = true)
    public Integer subTypeId;

    @JsonProperty(value = "price", required = true)
    public BigDecimal price;

    @JsonProperty(value = "discount", required = true)
    public CreateDiscountDTO discountDTO;

    @JsonProperty(value = "quantity", defaultValue = "0")
    public Integer quantity;
}
