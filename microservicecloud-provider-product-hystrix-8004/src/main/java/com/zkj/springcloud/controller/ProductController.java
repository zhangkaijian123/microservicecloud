package com.zkj.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zkj.springcloud.entities.Product;
import com.zkj.springcloud.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-06-14 13:07
 **/
@RestController
public class ProductController {

    @Autowired
    private ProductClientService service;

    @RequestMapping(value = "/product/add",method = RequestMethod.GET)
    @HystrixCommand
    public boolean addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }

    @RequestMapping(value = "/product/all",method = RequestMethod.GET)
    public List<Product> findAllProduct(){
        return service.findAllProduct();
    }
}
