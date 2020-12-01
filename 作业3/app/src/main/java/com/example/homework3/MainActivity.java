package com.example.homework3;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {

    private String[] name=new String[]{"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private int[] imageIds = new int[]{R.drawable.lion,R.drawable.tiger,R.drawable.monkey,
    R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建一个List集合,List集合的元素是Map
        List<Map<String, Object>> listItems=new ArrayList<>();
        for (int i=0;i<name.length;i++){
            Map<String,Object> listItem=new HashMap<>();
            listItem.put("header", imageIds[i]);
            listItem.put("name",name[i]);
            listItems.add(listItem);
        }
        //创建一个SimpleAdapter
        SimpleAdapter simpleAdapter=new SimpleAdapter(this, listItems,R.layout.simple_item,new String[]{"name",
        "header"},new int[]{R.id.name, R.id.header});
        ListView list=findViewById(R.id.list);
        list.setAdapter(simpleAdapter);

        //为ListView的列表项的单击事件绑定事件监听器
        list.setOnItemClickListener((parent, view, position, id) ->{
            Toast toast = Toast.makeText(MainActivity.this, ""+name[position], Toast.LENGTH_SHORT);
            toast.show();
        });
    }
}