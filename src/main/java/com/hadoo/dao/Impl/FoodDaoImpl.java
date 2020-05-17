package com.hadoo.dao.Impl;

import com.hadoo.dao.FoodDao;
import com.hadoo.entity.Food;
import lombok.Data;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/5/12 15:16
 */
@Data
@Repository
public class FoodDaoImpl implements FoodDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void doCreateFood(Food food) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(food);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Food> findAllFoods() {
        String hql = "from Food";
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery(hql);
        List<Food> list = query.list();
        transaction.commit();
        session.close();
        return list;
    }

    @Override
    public void removeFood(Food food) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(food);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Food> findFoodById(Integer id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from Food f where f.id=:id";
        Query query = session.createQuery(hql);
        query.setInteger("id",id);
        List list = query.list();
        return list;
    }

    @Override
    public void updateFood(Food food) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(food);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Food> findFoodByName(String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from Food f where f.name=:name";
        Query query = session.createQuery(hql);
        query.setString("name",name);
        List list = query.list();
        transaction.commit();
        session.close();
        return list;
    }
}