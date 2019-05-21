package com.zkj.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-05-08 23:16
 **/
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;//主键
    private String dname;//部门名称
    private String db_source;//来自哪个数据库

    public Dept(String dname) {
        this.dname = dname;
    }
}
