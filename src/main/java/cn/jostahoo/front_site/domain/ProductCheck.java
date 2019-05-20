package cn.jostahoo.front_site.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 产品检测
 */
@Data
@Entity
@Table(name = "tb_product_check")
public class ProductCheck implements Serializable {

    @Id
    private Long id;
//类型（臭氧/PM2.5/总有机挥发物）
    String type;
//房间大小
    String roomSize;
//测试条件
    String tcondition;
//测试状态
    String status;
//测试结果
    String result;
    //X值
    String xValue;
//Y值
    String yValue;



}
