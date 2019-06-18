package com.zkj.springcloud.service;

import com.zkj.springcloud.entities.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-06-14 10:48
 **/
@FeignClient(value = "MICROSERVICECLOUD-PRODUCT",fallbackFactory = ProductClientServiceFallbackFactory.class)
public interface ProductClientService {

    @RequestMapping(value = "/product/add",method = RequestMethod.POST)
    public boolean addProduct(@RequestBody Product product);

    @RequestMapping(value = "/product/all",method = RequestMethod.GET)
    public List<Product> findAllProduct();
}
