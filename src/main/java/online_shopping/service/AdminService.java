package online_shopping.service;

import online_shopping.entity.User;

import java.util.List;

public interface AdminService {
    User blockUser(String id);
    User unBlock(String id);
    List<User> getAllUsers();
}
