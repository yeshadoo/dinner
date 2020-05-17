package com.hadoo.dao;

/**
 * @Author : hadoo
 * @Date : 2020/5/10 21:22
 */

import com.hadoo.entity.Product;

/**
 * 商品操作-持久层接口
 *
 */
public interface ProductDao {
    void saveProduct(Product product);
}