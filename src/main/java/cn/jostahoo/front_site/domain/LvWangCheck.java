package cn.jostahoo.front_site.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_lvwang_check")
public class LvWangCheck implements Serializable {

    @Id
    private Long id;

    //日期
    String tdate;

    //材料编号
    String lwType;

    //编号
    String lwNum;

    //温度
    String temperature;

    //湿度
    String humidity;

    //风量
    String airVolume;

    //阻力
    String resistance;

    //效率
    String efficiency;

}
