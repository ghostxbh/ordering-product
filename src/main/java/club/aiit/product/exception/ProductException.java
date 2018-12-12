package club.aiit.product.exception;

import club.aiit.product.enums.ResultEnum;

/**
 * @Author: ghostxbh
 * @Date: 12/12/2018 11:17
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
