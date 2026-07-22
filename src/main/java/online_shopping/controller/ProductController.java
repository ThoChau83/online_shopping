package online_shopping.controller;

import online_shopping.entity.Product;
import online_shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/api/v1/products")
    public List<Product> getProducts(){
        return productService.getAllItem();
    }




}
