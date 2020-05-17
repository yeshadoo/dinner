/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: OrderService
 * Author:   admin
 * Date:     2020/5/13 10:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hadoo.service;

import com.hadoo.entity.Order2;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2020/5/13
 * @since 1.0.0
 */
public interface OrderService {
    public void doCreateOrder(Order2 order);
    public List<Order2> findAllOrders();
    public void removeOrder(Order2 order);
    public void updateOrder(Order2 order);
}
