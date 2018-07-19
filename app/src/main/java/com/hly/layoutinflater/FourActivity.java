package com.hly.layoutinflater;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/7/19~~~~~~
 * ~~~~~~更改时间:2018/7/19~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class FourActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        View view = getLayoutInflater().inflate(R.layout.activity_main, null);
//        view = getLayoutInflater().inflate(R.layout.layout, null);
//        setContentView(view);

//        View view = getLayoutInflater().inflate(R.layout.activity_main, null);
//        view = getLayoutInflater().inflate(R.layout.layout, (ViewGroup) view,true);
//        setContentView(view);


        View view = getLayoutInflater().inflate(R.layout.activity_main, null);
        view = getLayoutInflater().inflate(R.layout.layout, (ViewGroup) view,false);
        setContentView(view);
    }
}
