package com.hadoo.dao.Impl;

import com.hadoo.dao.UserDao;
import com.hadoo.entity.User;
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
 * @Date : 2020/5/13 8:24
 */
@Data
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void addUser(User user) {
        Session session = this.sessionFactory.openSession();
        session.save(user);
        session.close();
    }

    @Override
    public List<User> showUserByRole(Integer id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from User u where u.role_id=?";
        Query query = session.createQuery(hql);
        query.setParameter(0,id);
        List<User> list = query.list();
        transaction.commit();
        session.close();
        return list;
    }

    @Override
    public User showUserByName(String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from User u where u.username=?";
        Query query = session.createQuery(hql);
        query.setParameter(0,name);
        List<User> list = query.list();
        transaction.commit();
        session.close();
        return list.get(0);
    }
}