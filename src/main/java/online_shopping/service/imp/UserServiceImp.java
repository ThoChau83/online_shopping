package online_shopping.service.imp;

import online_shopping.dto.request.UserCreationRequest;
import online_shopping.dto.response.UserCreationResponse;
import online_shopping.model.User;
import online_shopping.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Override
    public UserCreationResponse createUser(UserCreationRequest userCreationRequest) {
        return null;
    }

    @Override
    public void checkUserValidity(User user) {

    }
}
