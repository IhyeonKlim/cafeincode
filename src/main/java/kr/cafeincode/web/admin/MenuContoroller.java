package kr.cafeincode.web.admin;


import kr.cafeincode.service.admin.menu.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/menu")
public class MenuContoroller {

    private final MenuService menuService;
}
