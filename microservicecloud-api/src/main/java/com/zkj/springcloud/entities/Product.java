package com.zkj.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-06-14 00:02
 **/

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Product implements Serializable {
    private int id;
    private int money;
    private String db_source;
    public Product(int money) {
        this.money = money;
    }
}
