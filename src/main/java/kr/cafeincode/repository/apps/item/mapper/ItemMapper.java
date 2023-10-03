package kr.cafeincode.repository.apps.item.mapper;

import kr.cafeincode.domain.apps.Item;
import kr.cafeincode.repository.apps.item.ItemSearchCond;
import kr.cafeincode.repository.apps.item.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {

    void save(Item item);

    void update(@Param("id") Long id, @Param("updateParam") ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    List<Item> findAll(ItemSearchCond itemSearch);
}
