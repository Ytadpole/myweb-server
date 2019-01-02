package pers.yangs.myweb.entity.VO;

import pers.yangs.myweb.entity.User;

/**
 * @author yangs
 */
public class LoginVo {
    private String token;
    private User user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "LoginVo{" +
                "token='" + token + '\'' +
                ", user=" + user +
                '}';
    }
}
