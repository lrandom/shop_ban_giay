package edu.niit.luan.shop_ban_giay.services;

import edu.niit.luan.shop_ban_giay.models.User;
import edu.niit.luan.shop_ban_giay.respository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public IUserRepo userRepo;

    public boolean add(User user) {
        try {
            this.userRepo.save(user);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
