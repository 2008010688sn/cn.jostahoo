package cn.jostahoo.front_site.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 负氧离子
 */
@Entity
@Table(name = "tb_oxygen_ions")
public class OxygenIons implements Serializable {

    @Id
    private Long id;
    //标题
    @Column
    String title;

    @Column(name = "pcurl")
    String pcUrl;



}
