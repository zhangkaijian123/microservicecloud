package com.zkj.springcloud.dao;

import com.zkj.springcloud.entities.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-06-14 10:56
 **/
@Mapper
public interface ProductDao {

    public boolean addProduct(Product product);

    public List<Product> findAllProduct();
}
