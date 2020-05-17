/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserService
 * Author:   admin
 * Date:     2020/5/13 8:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hadoo.service;

import com.hadoo.entity.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2020/5/13
 * @since 1.0.0
 */
public interface UserService {
    void addUser(User user);
    List<User> showUserByRole(Integer id);
    User showUserByName(String name);

}
