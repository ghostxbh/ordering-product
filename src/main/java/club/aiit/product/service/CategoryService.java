package club.aiit.product.service;

import club.aiit.product.model.Category;

import java.util.List;

/**
 * @Author: ghostxbh
 * @Date: 11/12/2018 11:30
 */
public interface CategoryService {

    List<Category> findByTypeIn(List<Integer> typeList);
}
