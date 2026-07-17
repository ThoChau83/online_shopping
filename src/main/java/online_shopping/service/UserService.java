package online_shopping.service;

import online_shopping.dto.request.UserCreationRequest;
import online_shopping.dto.response.UserCreationResponse;
import online_shopping.model.User;

public interface UserService {

    UserCreationResponse createUser (UserCreationRequest userCreationRequest);

    void checkUserValidity(User user);
}
