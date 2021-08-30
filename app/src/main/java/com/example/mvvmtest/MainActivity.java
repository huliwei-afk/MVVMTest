package com.example.mvvmtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

//如果修改了文件位置要在这里导入
import com.example.ActivityFirst;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFirst binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Swordsman swordsman = new Swordsman("张无忌","S");
        binding.setSwordsman(swordsman);
        //事件处理方式一
        binding.btNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //事件处理方式二
        binding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //基本数据类型
        binding.setNickname("风清扬");
        binding.setAge(30);
        binding.setIsPerson(true);

        //集合
        ArrayList list = new ArrayList();
        list.add("0");
        list.add("1");
        binding.setList(list);

        Map map = new HashMap();
        map.put("age", "30");
        binding.setMap(map);

        String[] arrays = {"张无忌"," 慕容英"};
        binding.setArrays(arrays);

        //静态类Utils
        binding.setSwordsman(new Swordsman("独孤","SS"));

        //数据转换
        binding.setTime(new Date());
    }
}