package com.hadoo.dao;

import com.hadoo.entity.User;
import lombok.Data;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/5/11 17:32
 */
@Data
@Repository
public class LoginDao {
    @Autowired
    private SessionFactory sessionFactory;
    public User getByName(String name){
        Session session = this.sessionFactory.openSession();
//        String sqlCharset = "set names utf8mb4";
//        session.createSQLQuery(sqlCharset);
        List list = session.createSQLQuery("select * from user where username = '"+name+"'").
                addEntity(User.class).list();
        session.close();
        if(list != null && list.size() != 0){
            return (User) list.get(0);
        }else {
            return null;
        }
    }
}