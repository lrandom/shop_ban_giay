package edu.niit.luan.shop_ban_giay.respository;

import edu.niit.luan.shop_ban_giay.models.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User,Long> {

}
