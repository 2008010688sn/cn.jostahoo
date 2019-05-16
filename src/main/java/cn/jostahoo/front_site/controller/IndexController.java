package cn.jostahoo.front_site.controller;

import cn.jostahoo.front_site.domain.*;
import cn.jostahoo.front_site.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @GetMapping(value = "/slider")
    public List<Subtitle> getSliderInfo(){
        return indexService.getSliderInfo();
    }

    @GetMapping(value = "/theme")
    public List<Theme> getThemeInfo(){
        return indexService.getThemeInfo();
    }

    @GetMapping(value = "/threeModule")
    public List<ThreeModule> getThreeModuleInfo(){
        return indexService.getThreeModuleInfo();
    }

    @GetMapping(value = "/oxygenIons")
    public List<OxygenIons> getOxygenIonsInfo(){
        return indexService.getOxygenIonsInfo();
    }

    @GetMapping(value = "/advantage")
    public List<Advantage> getAdvantageInfo(){
        return indexService.getAdvantageInfo();
    }

    @GetMapping(value = "/patent")
    public List<Patent> getPatentInfo(){
        return indexService.getPatentInfo();
    }


    @GetMapping(value = "/price")
    public List<Price> getPriceInfo(){
        return indexService.getPriceInfo();
    }

    @GetMapping(value = "/systemComparison")
    public List<SystemComparison> getSystemComparisonInfo(){
        return indexService.getSystemComparisonInfo();
    }

    @GetMapping(value = "/brandComparison")
    public List<BrandComparison> getBrandComparisonInfo(){
        return indexService.getBrandComparisonInfo();
    }

    @GetMapping(value = "/company")
    public Company getCompanyInfo(){
        return indexService.getCompanyInfo();
    }

    @GetMapping(value = "/brandComparison")
    public List<CooperativePartner> getCooperativePartnerInfo(){
        return indexService.getCooperativePartnerInfo();
    }




}
