package edu.niit.luan.shop_ban_giay.controllers.admin;

import edu.niit.luan.shop_ban_giay.models.Product;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class ProductController implements IAdminController<Product>{
    @Override
    public String list(Model mode, int page) {
        return null;
    }

    @Override
    public String add(Model model) {
        return null;
    }

    @Override
    public String doAdd(Product user, RedirectAttributes flashSession) {
        return null;
    }

    @Override
    public String edit(Long id, Model model) {
        return null;
    }

    @Override
    public String doEdit(Product obj, String password) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
