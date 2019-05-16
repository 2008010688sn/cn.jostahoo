package cn.jostahoo.front_site.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 价格
 */
@Entity
@Table(name = "tb_price")
public class Price implements Serializable {

    @Id
    private Long id;

    //类型
    @Column
    String type;

    //中文型号
    @Column
    String modelZH;

    //英文型号
    @Column
    String modelEN;

    Float price;

    //产品描述
    String pDesc;

    //参数说明
    String parameterDesc;



}
