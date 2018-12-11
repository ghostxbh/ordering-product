package club.aiit.product.service;

import club.aiit.product.ProductApplicationTests;
import club.aiit.product.model.Product;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: ghostxbh
 * @Date: 11/12/2018 11:27
 */

@Component
public class ProductServiceTest extends ProductApplicationTests{

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<Product> productList = productService.findUpAll();
        Assert.assertTrue(productList.size()>0);
    }
}