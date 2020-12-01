package com.example.homework3;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends Activity
{
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt = findViewById(R.id.txt);
        // 为文本框注册上下文菜单
        registerForContextMenu(txt);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // 装填R.menu.menu_main对应的菜单，并添加到menu中
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // 创建上下文菜单时触发该方法
    @Override
    public void onCreateContextMenu(ContextMenu menu,
                                    View source, ContextMenu.ContextMenuInfo menuInfo)
    {
        // 装填R.menu.context对应的菜单，并添加到menu中
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.setHeaderTitle("请选择背景色");
    }
    // 上下文菜单中菜单项被单击时触发该方法
    @Override public boolean onContextItemSelected(MenuItem mi)
    {
        // 勾选该菜单项
        if (mi.isCheckable())
        {
            mi.setChecked(true); // ②
        }
        // 判断单击的是哪个菜单项，并有针对性地做出响应
        switch (mi.getItemId())
        {
            case R.id.font_10: txt.setTextSize(10 * 2); break;
            case R.id.font_16: txt.setTextSize(16 * 2); break;
            case R.id.font_20: txt.setTextSize(20 * 2); break;
            case R.id.red_font: txt.setTextColor(Color.RED); break;
            case R.id.green_font: txt.setTextColor(Color.GREEN); break;
            case R.id.blue_font: txt.setTextColor(Color.BLUE); break;
            case R.id.plain_item:
                Toast.makeText(MainActivity3.this,
                        "您单击了普通菜单项", Toast.LENGTH_SHORT)
                        .show();
                break;
        }
        return true;
    }
    // 菜单项被单击后的回调方法
    @Override public boolean onOptionsItemSelected(MenuItem mi)
    {
        // 勾选该菜单项
        if (mi.isCheckable())
        {
            mi.setChecked(true); // ②
        }
        // 判断单击的是哪个菜单项，并有针对性地做出响应
        switch (mi.getItemId())
        {
            case R.id.font_10: txt.setTextSize(10 * 2); break;
            case R.id.font_16: txt.setTextSize(16 * 2); break;
            case R.id.red_font: txt.setTextColor(Color.RED); break;
            case R.id.green_font: txt.setTextColor(Color.GREEN); break;
            case R.id.blue_font: txt.setTextColor(Color.BLUE); break;
            case R.id.plain_item:
                Toast.makeText(MainActivity3.this,
                        "您单击了普通菜单项", Toast.LENGTH_SHORT)
                        .show();
                break;
        }
        return true;
    }
}