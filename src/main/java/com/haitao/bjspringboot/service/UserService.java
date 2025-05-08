package com.haitao.bjspringboot.service;

import com.haitao.bjspringboot.entity.pojo.User;

/**
 * @author HaiTao_G
 */
public interface UserService {

    boolean isExist(String username);

    User getByName(String username);

    User get(String username, String password);

    public void add(User user) ;
}
