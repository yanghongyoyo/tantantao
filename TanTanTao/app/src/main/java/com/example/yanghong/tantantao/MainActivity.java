package com.example.yanghong.tantantao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ali.auth.third.ui.context.CallbackContext;
import com.alibaba.baichuan.android.trade.adapter.login.AlibcLogin;
import com.alibaba.baichuan.android.trade.callback.AlibcLoginCallback;
import com.blankj.utilcode.util.LogUtils;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

    }

    @OnClick({R.id.button1})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button1:

                break;
            case R.id.button2:

                break;
            case R.id.button3:
                break;
            case R.id.button4:
                break;
            case R.id.button5:
                break;

        }
    }

    public void login() {

        final AlibcLogin alibcLogin = AlibcLogin.getInstance();

        alibcLogin.showLogin(MainActivity.this, new AlibcLoginCallback() {

            @Override
            public void onSuccess() {
                Toast.makeText(MainActivity.this, "登录成功 ",
                        Toast.LENGTH_LONG).show();
                //获取淘宝用户信息
                LogUtils.e("获取淘宝用户信息: "+AlibcLogin.getInstance().getSession());

            }
            @Override
            public void onFailure(int code, String msg) {
                LogUtils.e("登录失败 "+msg);
            }
        });
    }

}
