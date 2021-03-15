package edu.niit.luan.shop_ban_giay.respository;

import edu.niit.luan.shop_ban_giay.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepo extends PagingAndSortingRepository<User,Long> {

}
