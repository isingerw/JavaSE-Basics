package com.singerw.login_game.dao;

import com.singerw.login_game.pojo.User;

/**
 * @ClassName: UserDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-26 18:38
 */
public interface UserDao {

    /**
     * 登录检测，成功返回true,失败返回false
     *
     * @param username
     * @param password
     * @return
     */
    boolean isLogin(String username, String password);

    /**
     *
     * @param username
     * @param password
     * @return
     */
    User regist(String username, String password);
}
