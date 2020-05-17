package com.hadoo.service.Impl;

/**
 * @Author : hadoo
 * @Date : 2020/5/10 21:26
 */

import com.hadoo.dao.ProductDao;
import com.hadoo.entity.Product;
import com.hadoo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public void saveProduct(Product product) {
        productDao.saveProduct(product);
    }

}