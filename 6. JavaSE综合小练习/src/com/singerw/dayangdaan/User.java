package com.singerw.dayangdaan;

/**
* @ClassName: User
* @Description: TODO(������һ�仰��������������)
* @Author ����
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
     * ��¼�Ƚ��û���������
     * @param user
     * @return
     */
    public boolean login(User user){
        // �Ƚϵ�ǰ��Ķ��� �� ���ݽ�����user���û����������Ƿ����
        if (this == user){
            return true;
        }
        if (this.username.equals(user.getUsername())){
            return false;
        }
        return !this.password.equals(user.getPassword());
    }
}
