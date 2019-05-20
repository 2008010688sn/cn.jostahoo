package cn.jostahoo.front_site.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 专利
 */
@Entity
@Table(name = "tb_patent")
public class Patent implements Serializable {

    @Id
    private Long id;

    //标题
    @Column
    String title;

    String pcUrl;

}
