package cn.jostahoo.front_site.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 公司简介
 */
@Entity
@Table(name = "tb_company")
public class Company implements Serializable {

    @Id
    private Long id;

    //名称
    String name;

    //描述
    String desc;

    //口号
    @Column
    String slogan;

    //logo
    String logoUrl;

    //logo2
    String logoUrl2;

    //纬度
    String latitude;

    //经度
    String longitude;

    //地址
    String adress;

    //电话
    String phone;

    //邮箱
    String email;

    //微信地址
    String weichatUrl;



}
