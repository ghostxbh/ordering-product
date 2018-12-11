package club.aiit.product.dao;

import club.aiit.product.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryMapper extends JpaRepository<Category,Integer>{

    List<Category> findByTypeIn(List<Integer> typeList);
}
