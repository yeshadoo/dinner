package com.hadoo.service.Impl;

import com.hadoo.dao.FoodDao;
import com.hadoo.entity.Food;
import com.hadoo.service.FoodService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/5/12 15:23
 */
@Data
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodDao foodDao;
    @Override
    public void doCreateFood(Food food) {
        this.foodDao.doCreateFood(food);
    }

    @Override
    public List<Food> findAllFoods() {
        return this.foodDao.findAllFoods();
    }

    @Override
    public void delete(Food food) {
        this.foodDao.removeFood(food);
    }

    @Override
    public void update(Food food) {
        this.foodDao.updateFood(food);
    }

    @Override
    public List<Food> findFoodByName(String name) {
        return this.foodDao.findFoodByName(name);

    }

    @Override
    public List<Food> findFoodById(Integer id) {
        return this.foodDao.findFoodById(id);
    }
}
