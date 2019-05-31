package com.zkj.springcloud.service.impl;

import com.zkj.springcloud.dao.DeptDao;
import com.zkj.springcloud.entities.Dept;
import com.zkj.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-05-10 10:41
 **/
@Service
public class DeptClientServiceImpl implements DeptClientService {

    @Autowired
    private DeptDao deptDao;



    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
