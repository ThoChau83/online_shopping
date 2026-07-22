package online_shopping.controller;

import jakarta.validation.Valid;
import online_shopping.constant.UrlConstant;
import online_shopping.dto.request.UserCreationRequest;
import online_shopping.dto.request.auth.UserRegisterRequest;
import online_shopping.dto.response.UserCreationResponse;
import online_shopping.entity.Product;
import online_shopping.entity.User;
import online_shopping.service.ProductService;
import online_shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @PostMapping(UrlConstant.USERS)
    public Object createUser(@RequestBody UserCreationRequest userCreationRequest) {

        UserCreationResponse userCreationResponse = new UserCreationResponse();
        userCreationResponse.setName(userCreationRequest.getName());

        return userCreationResponse;
    }

    @PostMapping("/api/v1/register")
    public Object registerUser(@Valid @RequestBody  UserRegisterRequest userRegisterRequest) throws Exception {
        return userService.registerUser(userRegisterRequest);
    }




}
