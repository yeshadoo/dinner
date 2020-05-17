package com.hadoo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author : hadoo
 * @Date : 2020/5/12 11:16
 */
@Data
@Entity
public class Order2 {
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id", strategy = "native") //自定义主键生成策略 generator = name
    private Integer id;
    private String uname;
    private String cname;
    private String o_status;
    private Double o_price;
}