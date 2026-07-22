package online_shopping.service;

import online_shopping.dto.request.product.ProductCreateRequest;
import online_shopping.dto.request.product.ProductUpdateRequest;
import online_shopping.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllItem();

    void deleteProduct(String id);

    Product createProduct(ProductCreateRequest productCreateRequest);

    Product updateProduct(ProductUpdateRequest productUpdateRequest, String id);
}
