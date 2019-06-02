package com.zkj.springcloud.service;

import com.zkj.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-05-31 22:58
 **/
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("该ID"+id+"没有对应的信息，Consumer客户端提供的降级信息，该服务provider已经停止服务").setDb_source("no this database in MYSQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
