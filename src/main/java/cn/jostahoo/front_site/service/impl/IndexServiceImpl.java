package cn.jostahoo.front_site.service.impl;

import cn.jostahoo.front_site.domain.*;
import cn.jostahoo.front_site.repository.*;
import cn.jostahoo.front_site.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    SubTitleRepository subTitleRepository;

    @Autowired
    ThemeRepository themeRepository;

    @Autowired
    ThreeModuleRepository threeModuleRepository;

    @Autowired
    OxygenIonsRepository oxygenIonsRepository;

    @Autowired
    AdvantageRepository advantageRepository;

    @Autowired
    PatentRepository patentRepository;

    @Autowired
    PriceRepository priceRepository;

    @Autowired
    SystemComparisonRepository systemComparisonRepository;

    @Autowired
    BrandComparisonRepository brandComparisonRepository;

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    CooperativePartnerRepository cooperativePartnerRepository;

    @Autowired
    CheckRepository checkRepository;

    @Autowired
    ProductCheckRepository productCheckRepository;

    @Autowired
    LvWangCheckRepository lvWangCheckRepository;

    @Override
    public Map<String, Object> getShouyeInfos() {
        Map<String,Object> map=new HashMap<>();
        //首页滚动
        List<Subtitle> subtitleList=subTitleRepository.findAll();
        map.put("subtitleList",subtitleList);
        //主题
        List<Theme> themeList=themeRepository.findAll();
        map.put("themeList",themeList);
        //三大模块
        List<ThreeModule> threeModuleList=threeModuleRepository.findAll();
        map.put("threeModuleList",threeModuleList);
        //负氧离子
        List<OxygenIons> oxygenIonsList=oxygenIonsRepository.findAll();
        map.put("oxygenIonsList",oxygenIonsList);
        //优点
        List<Advantage> advantageList=advantageRepository.findAll();
        map.put("advantageList",advantageList);
        //专利
        List<Patent> patentList=patentRepository.findAll();
        map.put("patentList",patentList);
        //检测
        List<Check> checkList=checkRepository.findAll();
        map.put("checkList",checkList);
        //价格
        List<Price> priceList=priceRepository.findAll();
        map.put("priceList",priceList);

        //简介
        Company company=companyRepository.findAll().get(0);
        map.put("company",company);

     //伙伴
        List<CooperativePartner> cooperativePartnerList=cooperativePartnerRepository.findAll();
        map.put("cooperativePartnerList",cooperativePartnerList);

        return map;
    }

    //获取产品对比信息
    public Map<String,Object> getProductComparison(){
        Map<String,Object> map=new HashMap<>();
        List<SystemComparison> systemComparisonList=systemComparisonRepository.findAll();;
        map.put("systemComparisonList",systemComparisonList);

        List<BrandComparison> brandComparisonList=brandComparisonRepository.findAll();
        map.put("brandComparisonList",brandComparisonList);
        return  map;
    }

    //产品整体检测
    @Override
    public Map<String, Object> getProductCheckInfos() {
        Map<String,Object> map=new HashMap<>();
        List<ProductCheck> productCheckList=productCheckRepository.findAll();
        map.put("productCheckList",productCheckList);
        return map;
    }

    //滤网检测
    @Override
    public Map<String, Object> getLvWangCheckInfos() {
        Map<String,Object> map=new HashMap<>();
        List<LvWangCheck> lvWangCheckList=lvWangCheckRepository.findAll();
        map.put("lvWangCheckList",lvWangCheckList);
        return map;
    }




}
