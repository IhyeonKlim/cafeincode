package kr.cafeincode.repository.apps.item.repository;

import kr.cafeincode.domain.apps.Item;
import kr.cafeincode.repository.apps.item.ItemSearchCond;
import kr.cafeincode.repository.apps.item.ItemUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ItemRepository {
    Item save(Item item);

    void update(Long itemId, ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    List<Item> findAll(ItemSearchCond cond);
}
