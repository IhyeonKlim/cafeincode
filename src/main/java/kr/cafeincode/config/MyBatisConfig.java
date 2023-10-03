package kr.cafeincode.config;

import kr.cafeincode.repository.apps.item.mapper.ItemMapper;
import kr.cafeincode.repository.apps.item.repository.ItemRepository;
import kr.cafeincode.repository.apps.item.repository.ItemRepositoryImpl;
import kr.cafeincode.service.apps.item.ItemService;
import kr.cafeincode.service.apps.item.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {

    private final ItemMapper itemMapper;

    @Bean
    public ItemService itemService() {
        return new ItemServiceImpl(itemRepository());
    }

    @Bean
    public ItemRepository itemRepository() {
        return new ItemRepositoryImpl(itemMapper);
    }
}
