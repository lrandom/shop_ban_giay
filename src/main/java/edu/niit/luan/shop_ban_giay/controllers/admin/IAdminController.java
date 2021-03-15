package edu.niit.luan.shop_ban_giay.controllers.admin;

import edu.niit.luan.shop_ban_giay.models.User;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface IAdminController {
    public String list(Model mode, int page);
    public String  add(Model model);
    public String doAdd(User user, RedirectAttributes flashSession);
    public String edit();
    public String delete();
}
