package cn.jostahoo.front_site.service;

import cn.jostahoo.front_site.domain.*;

import java.util.List;
import java.util.Map;

public interface IndexService {


   public Map<String,Object> getShouyeInfos();
    //首页滚动
    public List<Subtitle> getSliderInfo();

    //三大主题
    public List<Theme> getThemeInfo();

    //三大模块
    public List<ThreeModule> getThreeModuleInfo();

    //负氧离子
    public List<OxygenIons> getOxygenIonsInfo();

    //优点
    public List<Advantage> getAdvantageInfo();

    //专利
    public List<Patent> getPatentInfo();

    //价格
    public List<Price> getPriceInfo();

    //不同系统对比
    public List<SystemComparison> getSystemComparisonInfo();

    //不同品牌对比
    public List<BrandComparison> getBrandComparisonInfo();

    //公司介绍
    public Company getCompanyInfo();

    //或作伙伴
    public List<CooperativePartner> getCooperativePartnerInfo();

}
