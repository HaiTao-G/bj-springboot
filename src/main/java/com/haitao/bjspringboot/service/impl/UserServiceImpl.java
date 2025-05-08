package com.haitao.bjspringboot.service.impl;

import com.haitao.bjspringboot.dao.UserDao;
import com.haitao.bjspringboot.entity.pojo.User;
import com.haitao.bjspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HaiTao_G
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean isExist(String username) {
        User user = getByName(username);
        return null!=user;
    }

    @Override
    public User getByName(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User get(String username, String password){
        return userDao.getByUsernameAndPassword(username, password);
    }

    @Override
    public void add(User user) {
        userDao.save(user);
    }
}
