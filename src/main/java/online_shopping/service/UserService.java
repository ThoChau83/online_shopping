package online_shopping.service;

import online_shopping.dto.request.UserCreationRequest;
import online_shopping.dto.request.auth.UserRegisterRequest;
import online_shopping.dto.response.UserCreationResponse;
import online_shopping.dto.response.auth.UserRegisterResponse;
import online_shopping.entity.User;

import java.util.List;

public interface UserService {

    UserCreationResponse createUser (UserCreationRequest userCreationRequest);

    void checkUserValidity(User user);

    User registerUser (UserRegisterRequest userRegisterRequest) throws Exception;

    List<User> getAllUsers();


}
