package online_shopping.service;

import online_shopping.model.User;

import java.util.List;

public interface CartService {
    List<Object> viewCart(User user);
}
