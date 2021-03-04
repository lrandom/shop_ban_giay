package edu.niit.luan.shop_ban_giay.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController implements IAdminController{
    @Override
    public String list() {
        return "admin/list";
    }

    @Override
    @GetMapping("/admin/user/add")
    public String add() {
        return "admin/add";
    }

    @Override
    public String edit() {
        return "admin/edit";
    }

    @Override
    public String delete() {
        return null;
    }
}
