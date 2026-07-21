package online_shopping.service.imp;

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
}
