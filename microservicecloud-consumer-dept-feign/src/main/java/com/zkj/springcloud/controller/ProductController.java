package com.zkj.springcloud.controller;

import com.zkj.springcloud.entities.Dept;
import com.zkj.springcloud.entities.Product;
import com.zkj.springcloud.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-06-14 13:14
 **/
@RestController
public class ProductController {

    @Autowired
    private ProductClientService service;

    @RequestMapping(value = "/consumer/product/add")
    public boolean addProduct(Product product){
        return this.service.addProduct(product);
    }

    @RequestMapping(value = "/consumer/product/all")
    public List<Product> findAllProduct(){
        return this.service.findAllProduct();
    }
}
