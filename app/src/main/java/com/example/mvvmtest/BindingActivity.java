package com.example.mvvmtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;

import android.os.Bundle;
import android.view.View;

import com.example.mvvmtest.databinding.ActivityBindingBinding;

import java.util.ArrayList;
import java.util.List;

public class BindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_binding);
        //ObSwordsman继承BaseObservable
        ObSwordsman obSwordsman = new ObSwordsman("任我行","A");
        binding.setObSwordsman(obSwordsman);
        binding.btUpdataObswordsman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obSwordsman.setName("石破天");
            }
        });

        //ObFSwordsman继承ObservableField
        ObFSwordsman obFSwordsman = new ObFSwordsman("风清扬","S");
        binding.setObFSwordsman(obFSwordsman);
        binding.btUpdataObFSwordsman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obFSwordsman.name.set("令狐冲");
            }
        });

        //容器类 无需创建model
        ArrayList<Swordsman> list = new ObservableArrayList<>();
        Swordsman swordsman1 = new Swordsman("张无忌","S");
        Swordsman swordsman2 = new Swordsman("周芷若","B");
        list.add(swordsman1);
        list.add(swordsman2);
        binding.setList(list);
        binding.btUpdataObmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swordsman1.setName("杨过");
                swordsman2.setName("小龙女");

                binding.setList(list);
            }
        });

        //双向绑定
        ObSwordsman obSwordsman1 = new ObSwordsman("任我行","A");
        binding.setObSwordsman(obSwordsman1);
        binding.btUpdataBindReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obSwordsman1.setName("任我行");
            }
        });
    }
}