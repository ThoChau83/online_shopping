package online_shopping.service.imp;

import online_shopping.entity.User;
import online_shopping.repository.UserRepository;
import online_shopping.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    private UserRepository userRepository;


}
