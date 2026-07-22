package online_shopping.controller;

import online_shopping.constant.UrlConstant;
import online_shopping.dto.request.product.ProductCreateRequest;
import online_shopping.dto.request.product.ProductUpdateRequest;
import online_shopping.entity.Product;
import online_shopping.entity.User;
import online_shopping.service.AdminService;
import online_shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Admin xem danh sach user
    @GetMapping("/api/v1/users")
    public List<User> getAllUsers(){
        return adminService.getAllUsers();
    }

    // Admin block user
    @PatchMapping(UrlConstant.BLOCK_USERS)
    public User blockUser( @PathVariable  String id){
        return adminService.blockUser(id);
    }

    // Admin unblock user
    @PatchMapping(UrlConstant.UNBLOCK_USERS)
    public User unBlock( @PathVariable  String id){
        return adminService.unBlock(id);
    }


    @PostMapping(UrlConstant.ADMIN_PRODUCTS)
    public Product createProduct(@RequestBody ProductCreateRequest productCreateRequest){
        return adminService.createProduct(productCreateRequest);
    }

    @PutMapping(UrlConstant.CRUD_ADMIN_PRODUCTS)
    public Product updateProduct(@RequestBody  ProductUpdateRequest productUpdateRequest, @PathVariable String id){
        return adminService.updateProduct(id, productUpdateRequest);
    }

    @DeleteMapping(UrlConstant.CRUD_ADMIN_PRODUCTS)
    public void deleteProduct(@PathVariable String id){
        adminService.deleteProduct(id);
    }





}
