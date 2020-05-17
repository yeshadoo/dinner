/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: FoodService
 * Author:   admin
 * Date:     2020/5/12 15:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hadoo.service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2020/5/12
 * @since 1.0.0
 */

import com.hadoo.entity.Food;

import java.util.List;

public interface FoodService {
    public void doCreateFood(Food food);
    public List<Food> findAllFoods();
    public void delete(Food food);
    public void update(Food food);
    public List<Food> findFoodByName(String name);
    public List<Food> findFoodById(Integer id);

}
