package online_shopping.controller;

import online_shopping.constant.UrlConstant;
import online_shopping.dto.request.UserCreationRequest;
import online_shopping.dto.response.UserCreationResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping(UrlConstant.API_V1_CREATE_USER)
    public Object createUser(@RequestBody UserCreationRequest userCreationRequest) {

        UserCreationResponse userCreationResponse = new UserCreationResponse();
        userCreationResponse.setName(userCreationRequest.getName());

        return userCreationResponse;
    }
}
