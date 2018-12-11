package club.aiit.product.service;

import club.aiit.product.model.Product;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有类目商品
     * @return
     */
    List<Product> findUpAll();
}
