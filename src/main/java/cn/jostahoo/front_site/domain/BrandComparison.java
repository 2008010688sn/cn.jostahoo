package cn.jostahoo.front_site.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 品牌对比
 */
@Entity
@Table(name = "tb_brand_comparison")
public class BrandComparison implements Serializable {

    @Id
    private Long id;

    //品牌
    String brand;

    //类型
    String type;

    //净化方式
    @Column
    String pattern;

    //污染物
    String contaminants;

    //循环方式
    String circulationMode;

    //又无臭氧
    Boolean isOzone;

    //是否高负氧离子
    boolean isOxygenIons;

    //噪音
    String noise;

    //市场价格
    Float price;

    //功耗
    String powerWaste;

    //清洁方式
    String cleaningMethod;

    //安装复杂度
    String installationComplexity;

}
