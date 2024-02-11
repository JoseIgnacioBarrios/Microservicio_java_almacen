package com.proyectomicroservicio.products_service.controllers;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.proyectomicroservicio.products_service.model.dtos.ProductRequest;
import com.proyectomicroservicio.products_service.model.dtos.ProductResponse;
import com.proyectomicroservicio.products_service.services.ProductService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody ProductRequest poductRequest){
        this.productService.addProduct(poductRequest);
    }

    @GetMapping
    @ResponseStatus
    public List<ProductResponse> getAllProducts(){
        return this.productService.getAllProducts();
    }
}
