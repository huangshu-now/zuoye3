package com.example.homework3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity_Intent extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bn= findViewById(R.id.btn_login);
        //为bn按钮绑定事件监听器
        bn.setOnClickListener(view -> {
            //创建一个ComponentName对象
            ComponentName comp= new ComponentName(
                    MainActivity_Intent.this, MainActivity.class);
            Intent intent= new Intent();
            //为Intent设置Component属性
            intent.setComponent(comp);
            startActivity(intent);
        });
    }
}
