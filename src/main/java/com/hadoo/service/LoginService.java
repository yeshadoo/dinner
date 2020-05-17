package com.hadoo.service;

import com.hadoo.dao.LoginDao;
import com.hadoo.entity.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : hadoo
 * @Date : 2020/5/11 17:51
 */
@Data
@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;
    public boolean sure(String username,String password){
        User user = this.loginDao.getByName(username);
        if(user == null){
            return false;
        }else {
            if(user.getPassword().equals(password)) {return true;}
            else{ return false;}
        }
    }
}