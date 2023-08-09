package sanity.nil.onlineshop.application.product.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import sanity.nil.onlineshop.application.product.dto.discount.CreateDiscountDTO;
import sanity.nil.onlineshop.application.product.dto.image.CreateProductImageDTO;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductDTO {

    @JsonProperty(value = "product_id")
    public UUID id;

    @JsonProperty(value = "description", required = true)
    public String description;

    @JsonProperty(value = "subtype_id", required = true)
    public Integer typeId;

    @JsonProperty(value = "name", required = true)
    public String name;

    @JsonProperty(value = "price", required = true)
    public BigDecimal price;

    @JsonProperty(value = "discount")
    public CreateDiscountDTO discountDTO;

    @JsonProperty(value = "images")
    public CreateProductImageDTO productImage;

    @JsonProperty(value = "quantity", defaultValue = "0")
    public Integer quantity;

}
