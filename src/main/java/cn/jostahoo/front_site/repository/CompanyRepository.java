package cn.jostahoo.front_site.repository;

import cn.jostahoo.front_site.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
