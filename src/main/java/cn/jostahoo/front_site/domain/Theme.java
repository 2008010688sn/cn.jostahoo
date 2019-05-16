package cn.jostahoo.front_site.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 三大主题
 */
@Table(name = "tb_theme")
@Entity
public class Theme implements Serializable {

    @Id
    private Long id;
//标题
    @Column
    String title;

    //描述
    @Column
    String desc;

    //更多
    @Column
    String moreDesc;

}
