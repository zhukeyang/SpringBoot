package com.wkcto.dubbo.service.impl;

import com.wkcto.dubbo.model.User;
import com.wkcto.dubbo.service.UserService;

public class UserServiceImpl implements UserService {



    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(1001);
        user.setUsername("zhangsan");
        user.setAge(23);
        return user;
    }
}
