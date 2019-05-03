package com.example.java_mvp.network;

import com.example.java_mvp.business.LoginRequest;
import com.example.java_mvp.business.LoginResponse;
import com.example.java_mvp.business.SearchResponse;
import com.example.java_mvp.network.response.ApiResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @author YangZhaoxin.
 * @since 2019/5/1 22:34.
 * email yangzhaoxin@hrsoft.net.
 */

public interface ApiService {

    @POST("/user/loginapp")
    Call<ApiResponse<LoginResponse>> login(@Body LoginRequest loginRequest);

    @POST("/pass/search")
    Call<ApiResponse<List<SearchResponse>>> search(@Query("car_number") String car_number);
}
