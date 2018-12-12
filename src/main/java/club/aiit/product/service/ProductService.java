package club.aiit.product.service;

import club.aiit.product.dto.CartDTO;
import club.aiit.product.model.Product;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有类目商品
     * @return
     */
    List<Product> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<Product> findList(List<Integer> productIdList);

    /**
     * 扣库存
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
