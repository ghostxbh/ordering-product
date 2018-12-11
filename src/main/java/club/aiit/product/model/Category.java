package club.aiit.product.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author xu
 * @DateTime 2018-12-11 10:00
 */
@Entity
@Data
public class Category {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer type;

    private Date createTime;

    private Date updateTime;
}
