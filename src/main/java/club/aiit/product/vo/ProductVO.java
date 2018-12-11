package club.aiit.product.vo;

import club.aiit.product.model.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


/**
 * @Author: ghostxbh
 * @Date: 11/12/2018 11:37
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    List<Product> productList;
}
