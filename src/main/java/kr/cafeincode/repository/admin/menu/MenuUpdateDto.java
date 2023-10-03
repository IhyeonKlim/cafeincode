package kr.cafeincode.repository.admin.menu;

import lombok.Data;

@Data
public class MenuUpdateDto {

    private String itemName;
    private Integer price;
    private Integer quantity;

    public MenuUpdateDto() {
    }

    public MenuUpdateDto(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
