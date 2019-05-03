package com.example.java_mvp.business;

/**
 * @author YangZhaoxin.
 * @since 2019/5/1 23:01.
 * email yangzhaoxin@hrsoft.net.
 */

public class LoginRequest {

    /**
     * id : 1010
     * password : 123456
     */

    private String id;
    private String password;

    public LoginRequest(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
