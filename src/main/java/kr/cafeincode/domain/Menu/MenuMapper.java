package kr.cafeincode.repository.admin.menu.mapper;

import kr.cafeincode.domain.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MenuMapper {
    void save(Menu menu);

    void update(@Param("id") String id, @Param("updateParam") Menu menu);

    Optional<Menu> findById(String id);

    List<Menu> findAll();

}
