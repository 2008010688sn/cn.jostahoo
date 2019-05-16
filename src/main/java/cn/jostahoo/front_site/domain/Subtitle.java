package cn.jostahoo.front_site.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 首页滚动条目
 */
@Data
@Entity
@Table(name = "tb_subtitle")
public class Subtitle implements Serializable {

    @Id
    private Long id;

    @Column
    String subTitle;



}
