package com.singerw.dayangdaan;

/**
* @ClassName: User
* @Description: TODO(这里用一句话描述这个类的作用)
* @Author 张欣
* @Date 2021-05-27 9:35
*/
public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    /**
     * 登录比较用户名和密码
     * @param user
     * @return
     */
    public boolean login(User user){
        // 比较当前类的对象 和 传递进来的user的用户名和密码是否相等
        if (this == user){
            return true;
        }
        if (this.username.equals(user.getUsername())){
            return false;
        }
        return !this.password.equals(user.getPassword());
    }
}
