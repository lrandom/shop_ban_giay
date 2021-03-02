package edu.niit.luan.shop_ban_giay.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String index(){
        return "layouts/admin/list";
    }
}
