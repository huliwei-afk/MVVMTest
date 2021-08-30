package com.example.mvvmtest;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mvvmtest.BR;

public class ObSwordsman extends BaseObservable {
    private String name;
    private String level;

    public ObSwordsman(String name, String level) {
        this.name = name;
        this.level = level;
    }

    //get里使用注解
    @Bindable
    public String getName() {
        return name;
    }

    //set里通知更新
    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
        notifyPropertyChanged(BR.level);
    }
}
