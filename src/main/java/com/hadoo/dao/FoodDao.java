package com.hadoo.dao;


import com.hadoo.entity.Food;

import java.util.List;


public interface FoodDao {
    public void doCreateFood(Food food);
    public List<Food> findAllFoods();
    public void removeFood(Food food);
    public void updateFood(Food food);
    public List<Food> findFoodByName(String name);
    public List<Food> findFoodById(Integer id);
}