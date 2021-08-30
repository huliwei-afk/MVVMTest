package com.example.mvvmtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.mvvmtest.databinding.ActivityRecyclerBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private ActivityRecyclerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler);

        initRecyclerView();
    }

    public void initRecyclerView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(RecyclerActivity.this);
        binding.recycler.setLayoutManager(linearLayoutManager);
        SwordsmanAdapter adapter = new SwordsmanAdapter(getList());
        binding.recycler.setAdapter(adapter);
    }

    public List<Swordsman> getList() {
        List<Swordsman> list = new ArrayList<>();
        Swordsman swordsman1 = new Swordsman("杨影枫","SS");
        Swordsman swordsman2 = new Swordsman("月眉儿","A");
        list.add(swordsman1);
        list.add(swordsman2);
        return list;
    }

}