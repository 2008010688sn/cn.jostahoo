package cn.jostahoo.front_site.service;

import cn.jostahoo.front_site.domain.*;

import java.util.List;
import java.util.Map;

public interface IndexService {

//首页显示信息
   public Map<String,Object> getShouyeInfos();

    //获取产品对比信息
    public Map<String,Object> getProductComparison();

    //产品整体检测信息
    public Map<String,Object> getProductCheckInfos();

    //滤网检测
    public Map<String,Object> getLvWangCheckInfos();



}
