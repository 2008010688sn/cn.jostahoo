package cn.jostahoo.front_site.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 合作伙伴
 */
@Entity
@Table(name = "tb_cooperative_partner")
public class CooperativePartner implements Serializable{

    @Id
    private Long id;

    //图片
    String pcUrl;



}
