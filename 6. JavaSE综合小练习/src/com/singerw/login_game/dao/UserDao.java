package com.singerw.login_game.dao;

import com.singerw.login_game.pojo.User;

/**
 * @ClassName: UserDao
 * @Description: TODO(������һ�仰��������������)
 * @Author ����
 * @Date 2021-05-26 18:38
 */
public interface UserDao {

    /**
     * ��¼��⣬�ɹ�����true,ʧ�ܷ���false
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
