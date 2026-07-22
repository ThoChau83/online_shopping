package online_shopping.service.imp;

import online_shopping.dto.request.product.ProductCreateRequest;
import online_shopping.dto.request.product.ProductUpdateRequest;
import online_shopping.entity.Product;
import online_shopping.repository.ProductRepository;
import online_shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllItem() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product createProduct(ProductCreateRequest productCreateRequest) {
        Product product = new Product();
        product.setName(productCreateRequest.getName());
        product.setCategory(productCreateRequest.getCategory());
        product.setDescription(productCreateRequest.getDescription());
        product.setStock(productCreateRequest.getStock());
        product.setOriginalPrice(productCreateRequest.getOriginalPrice());
        product.setPrice(productCreateRequest.getPrice());

        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(ProductUpdateRequest productUpdateRequest, String id) {
        Product product = productRepository.findById(id).orElseThrow();
        product.setPrice(productUpdateRequest.getPrice());
        product.setName(productUpdateRequest.getName());
        product.setCategory(productUpdateRequest.getCategory());
        product.setDescription(productUpdateRequest.getDescription());
        product.setStock(productUpdateRequest.getStock());
        product.setOriginalPrice(product.getOriginalPrice());

        return productRepository.save(product);
    }
}
