package com.hadoo.service.Impl;

import com.hadoo.dao.OrderDao;
import com.hadoo.entity.Order2;
import com.hadoo.service.OrderService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/5/12 15:23
 */
@Data
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public void doCreateOrder(Order2 order) {
        this.orderDao.doCreateOrder(order);
    }

    @Override
    public List<Order2> findAllOrders() {
        return this.orderDao.findAllOrders();
    }

    @Override
    public void removeOrder(Order2 order) {
        this.orderDao.removeOrder(order);
    }

    @Override
    public void updateOrder(Order2 order) {
        this.orderDao.updateOrder(order);
    }

}
