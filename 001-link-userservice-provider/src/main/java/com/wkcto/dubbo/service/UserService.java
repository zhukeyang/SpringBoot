package com.wkcto.dubbo.service;

import com.wkcto.dubbo.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User queryUserById(Integer id);
}
