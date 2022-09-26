package com.ducanhpro.service;

import com.ducanhpro.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductService iProductService;

    @Override
    public Iterable<Product> findAll() {
        return iProductService.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductService.findById(id);
    }
}
