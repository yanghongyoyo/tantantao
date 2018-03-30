package com.example.yanghong.tantantao;

import android.app.Application;
import android.util.Log;

import com.alibaba.baichuan.android.trade.AlibcTradeSDK;
import com.alibaba.baichuan.android.trade.callback.AlibcTradeInitCallback;
import com.blankj.utilcode.util.LogUtils;

/**
 * Created by yanghong on 2018/3/30.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        initAlibaba();
    }

    private void initAlibaba() {
        AlibcTradeSDK.asyncInit(this, new AlibcTradeInitCallback() {
            @Override
            public void onSuccess() {
                Log.e("测试","获取成功");
            }

            @Override
            public void onFailure(int code, String msg) {
                Log.e("测试","初始化失败"+msg+"错误码是："+code);

            }
        });
    }
}
