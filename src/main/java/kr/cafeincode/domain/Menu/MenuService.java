package kr.cafeincode.service.admin.menu;

import kr.cafeincode.domain.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

public interface MenuService {
    void save(Menu menu);

    void update(@Param("id") String id, @Param("updateParam") Menu menu);

    Optional<Menu> findById(String id);
    List<Menu> findAll();
}
