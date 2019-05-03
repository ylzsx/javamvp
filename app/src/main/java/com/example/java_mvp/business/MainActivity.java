package com.example.java_mvp.business;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.java_mvp.R;
import com.example.java_mvp.network.NetWorkFactory;
import com.example.java_mvp.network.response.ApiResponse;
import com.example.java_mvp.network.response.ResponCallBack;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        NetWorkFactory.getService().login(new LoginRequest("1069", "123456"))
//                .enqueue(new ResponCallBack<ApiResponse<LoginResponse>>() {
//                    @Override
//                    public void onDataResponse(Call<ApiResponse<LoginResponse>> call, Response<ApiResponse<LoginResponse>> response) {
//                        Toast.makeText(MainActivity.this, "成功", Toast.LENGTH_SHORT).show();
//                        Toast.makeText(MainActivity.this, response.body().getData().getTokenStr(), Toast.LENGTH_SHORT).show();
//                    }
//
//                    @Override
//                    public void onDataFailure(Call<ApiResponse<LoginResponse>> call, Throwable t) {
//
//                    }
//                });
        NetWorkFactory.getService().search("123")
                .enqueue(new ResponCallBack<ApiResponse<List<SearchResponse>>>() {
                    @Override
                    public void onDataResponse(Call<ApiResponse<List<SearchResponse>>> call, Response<ApiResponse<List<SearchResponse>>> response) {
                        Toast.makeText(MainActivity.this, "成功", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onDataFailure(Call<ApiResponse<List<SearchResponse>>> call, Throwable t) {

                    }
                });
    }
}
