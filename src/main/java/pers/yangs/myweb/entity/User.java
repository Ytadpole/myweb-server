package pers.yangs.myweb.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangs
 * @since 2019-01-02
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String userName;

    private String password;

    private String salt;

    public String getSalt() {
        return salt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}
