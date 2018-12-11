package club.aiit.product.service;

import club.aiit.product.ProductApplicationTests;
import club.aiit.product.model.Category;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: ghostxbh
 * @Date: 11/12/2018 11:32
 */
@Component
public class CategoryServiceTest extends ProductApplicationTests{

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByTypeIn() {
        List<Category> categoryList = categoryService.findByTypeIn(Arrays.asList(1, 2));
        Assert.assertTrue(categoryList.size()>0);
    }
}