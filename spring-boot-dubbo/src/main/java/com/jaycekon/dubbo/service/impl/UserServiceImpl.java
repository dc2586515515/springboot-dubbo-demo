package com.jaycekon.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jaycekon.dubbo.domain.User;
import com.jaycekon.dubbo.service.UserService;

/**
 * Created by Jaycekon on 2017/9/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        user.setId(1);
        System.out.println("我是服务提供方：" + user.toString());
        return user;
    }
}
