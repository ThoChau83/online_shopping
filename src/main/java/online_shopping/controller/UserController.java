package online_shopping.controller;

import online_shopping.constant.UrlConstant;
import online_shopping.dto.request.UserCreationRequest;
import online_shopping.dto.request.auth.UserRegisterRequest;
import online_shopping.dto.response.UserCreationResponse;
import online_shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(UrlConstant.USERS)
    public Object createUser(@RequestBody UserCreationRequest userCreationRequest) {

        UserCreationResponse userCreationResponse = new UserCreationResponse();
        userCreationResponse.setName(userCreationRequest.getName());

        return userCreationResponse;
    }

    @PostMapping("/api/v1/register")
    public Object registerUser(@RequestBody UserRegisterRequest userRegisterRequest){
        return userService.registerUser(userRegisterRequest);
    }


}
