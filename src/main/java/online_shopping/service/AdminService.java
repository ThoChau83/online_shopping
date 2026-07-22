package online_shopping.service;

import online_shopping.dto.request.product.ProductCreateRequest;
import online_shopping.dto.request.product.ProductUpdateRequest;
import online_shopping.entity.Product;
import online_shopping.entity.User;

import java.util.List;

public interface AdminService {
    User blockUser(String id);
    User unBlock(String id);
    List<User> getAllUsers();

    Product createProduct(ProductCreateRequest productCreateRequest);
    Product updateProduct(String id, ProductUpdateRequest productUpdateRequest);
    void deleteProduct(String id);
}
