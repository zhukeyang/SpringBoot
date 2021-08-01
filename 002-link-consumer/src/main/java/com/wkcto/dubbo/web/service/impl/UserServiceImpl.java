package com.wkcto.dubbo.web.service.impl;

import com.wkcto.dubbo.model.User;
import com.wkcto.dubbo.web.service.UserService;
import org.springframework.stereotype.Service;


@Service
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
