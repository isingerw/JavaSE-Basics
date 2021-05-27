package com.singerw.login_game.impl;

import com.singerw.login_game.dao.UserDao;
import com.singerw.login_game.pojo.User;

public class UserDaoImpl implements UserDao {
   private User user ;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public boolean isLogin(String username, String password) {
        boolean flag = false;
        if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            flag = true;
        }
        return flag;
    }

    @Override
    public User regist(String username, String password) {

        user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }
}
