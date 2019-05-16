package cn.jostahoo.front_site.repository;

import cn.jostahoo.front_site.domain.Patent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatentRepository extends JpaRepository<Patent,Long> {
}
