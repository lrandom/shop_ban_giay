package edu.niit.luan.shop_ban_giay.controllers.admin;

import edu.niit.luan.shop_ban_giay.models.User;
import edu.niit.luan.shop_ban_giay.services.UserService;
import edu.niit.luan.shop_ban_giay.services.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController implements IAdminController<User>{
    @Autowired
    public UserService userService;
    @Autowired
    public UtilService utilService;

    @GetMapping("/admin/user")
    @Override
    public String list(Model model,@RequestParam(defaultValue = "1") int page) {
        UserService.PagingResult pagingResult= userService.getPaginate(page);
        model.addAttribute("items", pagingResult.getListItems());
        model.addAttribute("activePage", page);
        model.addAttribute("totalPage", pagingResult.getTotalPage());
        return "admin/list";
    }

    @Override
    @GetMapping("/admin/user/add")
    public String add(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "admin/add";
    }

    @PostMapping("/admin/user/do-add")
    public String doAdd(User user, RedirectAttributes flashSession){
        if(  userService.add(user)){
            //thêm thông báo
            flashSession.addFlashAttribute("success","Thêm thành công");
        }else{
            flashSession.addFlashAttribute("error", "Thêm thất bại");
        }
        return "redirect:/admin/user/add";
    }

    @Override
    @GetMapping("/admin/user/edit")
    public String edit(@RequestParam Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("obj", user);
        return "admin/edit";
    }

    @Override
    @PostMapping("/admin/user/do-edit")
    public String doEdit(User obj, @RequestParam String password) {
        if(password!=null && !password.equalsIgnoreCase("")){
            obj.setPassword(utilService.getMd5(password));
        }
        userService.save(obj);
        return "redirect:/admin/user/edit?id="+obj.getId();
    }

    @Override
    public String delete(Long id) {
        userService.deleteById(id);
        return null;
    }
}
