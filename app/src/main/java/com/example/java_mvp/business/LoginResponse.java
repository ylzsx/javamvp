package com.example.java_mvp.business;

/**
 * @author YangZhaoxin.
 * @since 2019/5/1 23:01.
 * email yangzhaoxin@hrsoft.net.
 */

public class LoginResponse {
    /**
     * user_id : 1010
     * tokenStr : 0fbc16e112a7b7906cf789e6797acaac
     */

    private int user_id;
    private String tokenStr;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTokenStr() {
        return tokenStr;
    }

    public void setTokenStr(String tokenStr) {
        this.tokenStr = tokenStr;
    }
}
