package online_shopping.controller;

import online_shopping.constant.UrlConstant;
import online_shopping.entity.User;
import online_shopping.service.AdminService;
import online_shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;


    @GetMapping("/api/v1/users")
    public List<User> getAllUsers(){
        return adminService.getAllUsers();
    }

    @PatchMapping(UrlConstant.BLOCK_USERS)
    public User blockUser( @PathVariable  String id){
        return adminService.blockUser(id);
    }


}
