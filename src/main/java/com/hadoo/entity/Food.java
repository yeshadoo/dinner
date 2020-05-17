package com.hadoo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author : hadoo
 * @Date : 2020/5/12 11:14
 */
@Data
@Entity
@Component
public class Food {
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id", strategy = "native") //自定义主键生成策略 generator = name
    private Integer id;
    private String name;
    private Double price;
    private Integer category_id;
}