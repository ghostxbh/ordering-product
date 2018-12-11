package club.aiit.product.enums;

import lombok.Getter;

/**
 * 商品上下架状态
 *
 * @Author xu
 * @DateTime 2018-12-11 11:00
 */
public enum ProductEnums {
    UP(1, "在架"), DOWN(0, "下架");

    private Integer code;
    private String message;

    ProductEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
