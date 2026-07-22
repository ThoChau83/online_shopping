package online_shopping.service.imp;

import online_shopping.dto.request.UserCreationRequest;
import online_shopping.dto.request.auth.UserRegisterRequest;
import online_shopping.dto.response.UserCreationResponse;
import online_shopping.dto.response.auth.UserRegisterResponse;

import online_shopping.entity.User;
import online_shopping.repository.UserRepository;
import online_shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserCreationResponse createUser(UserCreationRequest userCreationRequest) {
        return null;
    }

    @Override
    public void checkUserValidity(User user) {

    }


    @Override
    public User registerUser(UserRegisterRequest userRegisterRequest) throws Exception {

        if(userRepository.existsByEmail(userRegisterRequest.getEmail())){
            throw new Exception("Da ton tai Email");
        }

        User user = new User();

        if(Objects.equals(userRegisterRequest.getPassword(), userRegisterRequest.getConfirmPassword())){

            user.setEmail(userRegisterRequest.getEmail());
            user.setFullname(userRegisterRequest.getFullname());
            user.setPassword(userRegisterRequest.getPassword());
            user.setRole("USER");
            user.setStatus("ACTIVE");



            return userRepository.save(user);
        } else return null;

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User blockUser(String id) {
        User user = userRepository.findById(id).orElseThrow();

        user.setStatus("BLOCKED");

        return userRepository.save(user);


    }


}
