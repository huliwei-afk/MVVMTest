package com.example.mvvmtest;

import androidx.databinding.BindingConversion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String getName(Swordsman swordsman){
        return swordsman.getName();
    }

    //数据转换器
    @BindingConversion
    public static String convertDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        return sdf.format(date);
    }
}
