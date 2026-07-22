package online_shopping.service.imp;

import online_shopping.entity.User;
import online_shopping.repository.UserRepository;
import online_shopping.service.AdminService;
import online_shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    private UserService userService;


    @Override
    public User blockUser(String id) {
        return userService.blockUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
