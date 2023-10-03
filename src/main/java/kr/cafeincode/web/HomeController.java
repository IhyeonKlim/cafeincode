package kr.cafeincode.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    /**
     * 09.03. Ihyeon kim
     * 주석 표준화 시키기.
     * main page
     * @return home
     */
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/home")
    public String examples() {
        return "fragments/apps/index";
    }

    /**
     * admin page.
     * @return admin.index
     */
    @RequestMapping("/admin.do")
    public String adminPage(){
        return "fragments/admin/adminHome";
    }
}
