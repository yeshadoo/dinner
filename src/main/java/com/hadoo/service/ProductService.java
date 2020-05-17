package com.hadoo.service;

/**
 * @Author : hadoo
 * @Date : 2020/5/10 21:25
 */


import com.hadoo.entity.Product;

/**
 * 商品操作-服务层接口
 *
 */
public interface ProductService {
    void saveProduct(Product product);
}