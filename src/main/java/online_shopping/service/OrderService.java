package online_shopping.service;

import online_shopping.model.Item;
import online_shopping.model.User;

import java.util.List;

public interface OrderService {

    Object createOrder(User user, List<Item> itemList);
}
