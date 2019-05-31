package com.zkj.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.zkj.springcloud.entities.Dept;
import com.zkj.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-05-10 10:43
 **/
@RestController
public class DeptController {

    @Autowired
    private DeptClientService deptClientService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptClientService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod  = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = this.deptClientService.get(id);
        if (dept == null){
            throw new RuntimeException("该ID"+id+"没有对应信息");
        }
        return dept;
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptClientService.list();
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        List<ServiceInstance> srvList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        return this.discoveryClient;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept().setDeptno(id).setDname("该ID"+id+"没有对应的信息，null--@HystrixCommand").setDb_source("no this database in MYSQL");
    }
}
