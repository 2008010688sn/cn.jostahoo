package cn.jostahoo.front_site.repository;

import cn.jostahoo.front_site.domain.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price,Long> {
}
