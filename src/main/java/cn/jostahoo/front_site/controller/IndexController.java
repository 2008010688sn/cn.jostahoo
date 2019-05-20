package cn.jostahoo.front_site.controller;

import cn.jostahoo.front_site.domain.*;
import cn.jostahoo.front_site.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @GetMapping(value = "/shouye")
    //首页显示信息
    public Map<String,Object> getShouyeInfos(){
        return indexService.getShouyeInfos();
    };

    @GetMapping(value = "/productComparison")
    //获取产品对比信息
    public Map<String,Object> getProductComparison(){
        return indexService.getProductComparison();
    };

    @GetMapping(value = "/productCheckInfos")
    //产品整体检测信息
    public Map<String,Object> getProductCheckInfos(){
        return indexService.getProductCheckInfos();
    };

    @GetMapping(value = "/lvWangCheckInfos")
    //滤网检测
    public Map<String,Object> getLvWangCheckInfos(){
        return indexService.getLvWangCheckInfos();
    };




}
