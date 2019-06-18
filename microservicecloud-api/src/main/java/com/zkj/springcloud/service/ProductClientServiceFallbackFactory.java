package com.zkj.springcloud.service;

import com.zkj.springcloud.entities.Product;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-06-14 13:01
 **/
@Component
public class ProductClientServiceFallbackFactory implements FallbackFactory<ProductClientService> {
    @Override
    public ProductClientService create(Throwable throwable) {
        return new ProductClientService(){

            @Override
            public boolean addProduct(Product product) {
                System.out.println("哈哈");
                return false;
            }

            @Override
            public List<Product> findAllProduct() {
                return null;
            }
        };
    }
}
