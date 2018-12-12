package club.aiit.product.controller;

import club.aiit.product.dto.CartDTO;
import club.aiit.product.model.Category;
import club.aiit.product.model.Product;
import club.aiit.product.service.CategoryService;
import club.aiit.product.service.ProductService;
import club.aiit.product.vo.ProductVO;
import club.aiit.product.vo.ResultVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author xu
 * @DateTime 2018-12-11
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    /**
     * 1、查询所有在架的商品
     * 2、获取类目category列表
     * 3、查询类目
     * 4、构造数据
     */
    @GetMapping("/list")
    public ResultVo<ProductVO> list() {
        //1、查询所有在架的商品
        List<Product> productList = productService.findUpAll();
        //2、获取类目category列表
        List<Integer> categoryTypeList = productList.stream().map(Product::getCategory).collect(Collectors.toList());
        //3、查询类目
        List<Category> categoryList = categoryService.findByTypeIn(categoryTypeList);
        //4、构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        for (Category category : categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(category.getName());
            productVO.setCategoryType(category.getType());
            List<Product> productList1 = new ArrayList<>();
            for (Product product : productList) {
                if (product.getCategory().equals(category.getType())) {
                    Product product1 = new Product();
                    BeanUtils.copyProperties(product, product1);
                    productList1.add(product1);
                }
            }
            productVO.setProductList(productList1);
            productVOList.add(productVO);
        }
        ResultVo resultVo = null;
        if (productVOList.size() > 0) {
            resultVo = new ResultVo(1, "success", productVOList);
        } else {
            resultVo = new ResultVo(2, "fail", null);
        }
        return resultVo;
    }

    /**
     * 获取商品列表（给订单服务调用的）
     * @param productIdList
     * @return
     */
    @PostMapping("/listForOrder")
    public List<Product> listForOrder(@RequestBody List<Integer> productIdList){
        return productService.findList(productIdList);
    }

    @PostMapping("/decreaseStock")
    public void decreaseStock(@RequestBody List<CartDTO> cartDTOList){
        productService.decreaseStock(cartDTOList);
    }
}
