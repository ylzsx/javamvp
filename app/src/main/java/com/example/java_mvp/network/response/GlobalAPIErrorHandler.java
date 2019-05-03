package com.example.java_mvp.network.response;

/**
 * @author YangZhaoxin.
 * @since 2019/5/1 22:46.
 * email yangzhaoxin@hrsoft.net.
 */

public class GlobalAPIErrorHandler {

    public static void handler(int code) {
        switch (code) {
            default:
                // "请求不被允许，请确定是否有权进行该操作"
                break;
        }
    }

    public static void handler(ApiException e) {
        switch (e.getCode()) {
            default:
//                e.getMessage()
                break;
        }
    }
}
