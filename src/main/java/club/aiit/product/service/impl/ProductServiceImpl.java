package club.aiit.product.service.impl;

import club.aiit.product.dao.ProductMapper;
import club.aiit.product.enums.ProductEnums;
import club.aiit.product.model.Product;
import club.aiit.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findUpAll() {
        return productMapper.findByStatus(ProductEnums.UP.getCode());
    }
}
