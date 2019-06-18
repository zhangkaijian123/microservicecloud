package com.zkj.springcloud.service.impl;

import com.zkj.springcloud.dao.ProductDao;
import com.zkj.springcloud.entities.Product;
import com.zkj.springcloud.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-06-14 12:59
 **/
@Service
public class ProductClientServiceImpl implements ProductClientService {

    @Autowired
    private ProductDao productDao;
    @Override
    public boolean addProduct(Product product) {
        return productDao.addProduct(product);
    }

    @Override
    public List<Product> findAllProduct() {
        return productDao.findAllProduct();
    }
}
