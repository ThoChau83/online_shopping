package online_shopping.service.imp;

import online_shopping.model.User;
import online_shopping.service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImp implements CartService {
    @Override
    public List<Object> viewCart(User user) {



        return List.of();
    }
}
