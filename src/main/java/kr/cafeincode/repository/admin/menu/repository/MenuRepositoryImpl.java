package kr.cafeincode.repository.admin.menu.repository;

import kr.cafeincode.domain.admin.Menu;
import kr.cafeincode.repository.admin.menu.mapper.MenuMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MenuRepositoryImpl implements MenuRepository{

    private final MenuMapper menuMapper;


    @Override
    public Menu save(Menu menu) {
        log.info("menuMapper class={}", menuMapper.getClass());
        menuMapper.save(menu);
        return menu;
    }

    @Override
    public void update(String menuId, Menu updateParam) {
        menuMapper.update(menuId,updateParam);
    }

    @Override
    public Optional<Menu> findById(String menuId) {
        return menuMapper.findById(menuId);
    }

    @Override
    public List<Menu> findAll(Menu cond) {
        return menuMapper.findAll();
    }
}
