package club.aiit.product;

import club.aiit.product.dao.CategoryMapper;
import club.aiit.product.dao.ProductMapper;
import club.aiit.product.model.Category;
import club.aiit.product.model.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {

	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private CategoryMapper categoryMapper;

	@Test
	public void getProduct() {
		List<Product> productList = productMapper.findByStatus(1);
		Assert.assertTrue(productList.size()>0);
	}

	@Test
	public void getCategory() {
		List<Category> categoryList = categoryMapper.findByTypeIn(Arrays.asList(1,2));
		Assert.assertTrue(categoryList.size()>0);
	}
}
