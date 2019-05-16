package cn.jostahoo.front_site.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 不同系统对比
 */
@Entity
@Table(name = "tb_system_comparison")
public class SystemComparison implements Serializable {


    @Id
    private Long id;

    //净化方式
    @Column
    String pattern;

    //优势
    String advantage;

    //缺点
    String weakness;



}
