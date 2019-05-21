package com.zkj.springcloud.dao;

import com.zkj.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-05-10 10:22
 **/
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
