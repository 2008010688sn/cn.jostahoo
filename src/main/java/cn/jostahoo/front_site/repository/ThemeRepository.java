package cn.jostahoo.front_site.repository;

import cn.jostahoo.front_site.domain.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemeRepository extends JpaRepository<Theme,Long> {
}
