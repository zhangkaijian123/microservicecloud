package com.zkj.springcloud.service;

import com.zkj.springcloud.entities.Dept;

import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-05-10 10:39
 **/
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
