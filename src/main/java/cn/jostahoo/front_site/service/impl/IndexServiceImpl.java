package cn.jostahoo.front_site.service.impl;

import cn.jostahoo.front_site.domain.*;
import cn.jostahoo.front_site.repository.*;
import cn.jostahoo.front_site.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Subtitle> getSliderInfo() {
        return subTitleRepository.findAll();
    }

    @Override
    public List<Theme> getThemeInfo() {
        return themeRepository.findAll();
    }

    @Override
    public List<ThreeModule> getThreeModuleInfo() {
        return threeModuleRepository.findAll();
    }

    @Override
    public List<OxygenIons> getOxygenIonsInfo() {
        return oxygenIonsRepository.findAll();
    }

    @Override
    public List<Advantage> getAdvantageInfo() {
        return advantageRepository.findAll();
    }

    @Override
    public List<Patent> getPatentInfo() {
        return patentRepository.findAll();
    }

    @Override
    public List<Price> getPriceInfo() {
        return priceRepository.findAll();
    }

    @Override
    public List<SystemComparison> getSystemComparisonInfo() {
        return systemComparisonRepository.findAll();
    }

    @Override
    public List<BrandComparison> getBrandComparisonInfo() {
        return brandComparisonRepository.findAll();
    }

    @Override
    public Company getCompanyInfo() {
        return companyRepository.findAll().get(0);
    }

    @Override
    public List<CooperativePartner> getCooperativePartnerInfo() {
        return cooperativePartnerRepository.findAll();
    }


}
