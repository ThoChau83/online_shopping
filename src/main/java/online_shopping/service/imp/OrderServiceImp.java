package online_shopping.service.imp;

import online_shopping.model.Item;
import online_shopping.model.User;
import online_shopping.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {

    @Override
    public Object createOrder(User user, List<Item> itemList) {
        return null;
    }
}
