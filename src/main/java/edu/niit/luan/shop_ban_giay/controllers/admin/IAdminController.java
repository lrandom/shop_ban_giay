package edu.niit.luan.shop_ban_giay.controllers.admin;

import edu.niit.luan.shop_ban_giay.models.User;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface IAdminController<T> {
    public String list(Model mode, int page);
    public String  add(Model model);
    public String doAdd(T user, RedirectAttributes flashSession);
    public String edit(Long id, Model model);
    public String doEdit(T obj, String password);
    public String delete(Long id);
}
