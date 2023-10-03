package kr.cafeincode.service.admin.menu;

import kr.cafeincode.domain.Menu;
import kr.cafeincode.repository.admin.menu.mapper.MenuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{

    private final MenuMapper menuMapper;

    @Override
    public void save(Menu menu) {
        menuMapper.save(menu);
    }

    @Override
    public void update(String id, Menu menu) {
        menuMapper.update(id,menu);
    }

    @Override
    public Optional<Menu> findById(String id) {
        return menuMapper.findById(id);
    }

    @Override
    public List<Menu> findAll() {
        return  menuMapper.findAll();
    }
}
