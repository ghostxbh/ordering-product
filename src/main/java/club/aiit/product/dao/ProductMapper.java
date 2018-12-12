package club.aiit.product.dao;


import club.aiit.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductMapper extends JpaRepository<Product,Integer>{


    List<Product> findByStatus(Integer status);

    List<Product> findByIdIn(List<Integer> idList);
}
