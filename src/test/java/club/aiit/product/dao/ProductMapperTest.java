package club.aiit.product.dao;

import club.aiit.product.ProductApplicationTests;
import club.aiit.product.model.Product;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: ghostxbh
 * @Date: 12/12/2018 10:42
 */
@Component
public class ProductMapperTest extends ProductApplicationTests{

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void findByStatus() {
    }

    @Test
    public void findByIdIn() {
        List<Product> productList = productMapper.findByIdIn(Arrays.asList(1, 2));
        Assert.assertTrue(productList.size()>0);
    }
}