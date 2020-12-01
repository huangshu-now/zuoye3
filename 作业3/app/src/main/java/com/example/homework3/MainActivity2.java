package com.example.homework3;

import android.app.Activity;
import android.content.ComponentName;
import android.os.Bundle;

import java.text.BreakIterator;

public class MainActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        //获取该Activity对应的Inter的Component属性
        ComponentName comp = getIntent().getComponent();
        //显示该ComponentName对象的包名、类名
        //show.setText("组件包名为："+comp.getPackageName()+"组件类名："+comp.getClassName());
    }
}
