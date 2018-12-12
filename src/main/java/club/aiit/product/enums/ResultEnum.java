package club.aiit.product.enums;

import lombok.Getter;

/**
 * @Author: ghostxbh
 * @Date: 12/12/2018 11:20
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(1,"商品不存在"),
    PRODUCT_STOCK_ERROR(2,"商品库存有误"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
