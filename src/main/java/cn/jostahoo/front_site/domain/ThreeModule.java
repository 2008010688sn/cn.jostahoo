package cn.jostahoo.front_site.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 三大模块
 */
@Entity
@Table(name = "tb_three_module")
public class ThreeModule implements Serializable {

    @Id
    private Long id;
    //标题
    @Column
    String title;

    String desc;


}
