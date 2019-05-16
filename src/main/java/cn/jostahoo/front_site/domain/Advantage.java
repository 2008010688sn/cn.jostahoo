package cn.jostahoo.front_site.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 优点
 */
@Entity
@Table(name = "tb_advantage")
public class Advantage implements Serializable {

    @Id
    private Long id;
    //标题
    @Column
    String title;

    @Column(name = "pcurl")
    String pcUrl;

    String icon1;

    String icon2;


}
