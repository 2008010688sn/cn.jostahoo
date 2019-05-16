package cn.jostahoo.front_site.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 检测
 *
 */
@Entity
@Table(name = "tb_inspection")
public class Inspection implements Serializable {

    @Id
    private Long id;

    //类型
    String type;

    //标题
    @Column
    String title;



}
