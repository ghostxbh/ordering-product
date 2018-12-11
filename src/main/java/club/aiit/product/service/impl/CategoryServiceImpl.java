package club.aiit.product.service.impl;

import club.aiit.product.dao.CategoryMapper;
import club.aiit.product.model.Category;
import club.aiit.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ghostxbh
 * @Date: 11/12/2018 11:31
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findByTypeIn(List<Integer> typeList) {
        return categoryMapper.findByTypeIn(typeList);
    }
}
