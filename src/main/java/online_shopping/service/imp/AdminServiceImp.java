package online_shopping.service.imp;

import online_shopping.dto.request.product.ProductCreateRequest;
import online_shopping.dto.request.product.ProductUpdateRequest;
import online_shopping.entity.Product;
import online_shopping.entity.User;
import online_shopping.repository.UserRepository;
import online_shopping.service.AdminService;
import online_shopping.service.ProductService;
import online_shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;


    @Override
    public User blockUser(String id) {
        return userService.blockUser(id);
    }

    @Override
    public User unBlock(String id) {
        return userService.unBlock(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    public Product createProduct(ProductCreateRequest productCreateRequest) {
        return productService.createProduct(productCreateRequest);
    }

    @Override
    public Product updateProduct(String id , ProductUpdateRequest productUpdateRequest) {
        return productService.updateProduct( productUpdateRequest, id);
    }

    @Override
    public void deleteProduct(String id) {
         productService.deleteProduct(id);
    }
}
