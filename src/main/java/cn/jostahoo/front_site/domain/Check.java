package cn.jostahoo.front_site.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 检测
 */
@Data
@Entity
@Table(name = "tb_check")
public class Check implements Serializable {

    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    String type;
    //标题
    @Column
    String title;

    String pcUrl;



}
