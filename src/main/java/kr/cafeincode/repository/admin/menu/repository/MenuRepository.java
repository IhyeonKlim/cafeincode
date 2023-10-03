package kr.cafeincode.repository.admin.menu.repository;

import kr.cafeincode.domain.admin.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuRepository {
    Menu save(Menu menu);

    void update(String menuId, Menu updateParam);

    Optional<Menu> findById(String menuId);

    List<Menu> findAll(Menu cond);
}
