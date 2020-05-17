package com.hadoo.service.Impl;

import com.hadoo.dao.UserDao;
import com.hadoo.entity.User;
import com.hadoo.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/5/13 8:28
 */
@Data
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Override
    public List<User> showUserByRole(Integer id) {
            return this.userDao.showUserByRole(id);
    }

    @Override
    public User showUserByName(String name) {
        return this.userDao.showUserByName(name);
    }
}