package com.hly.layoutinflater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *  root不为null，attachToRoot为true
         */

        LinearLayout ll = findViewById(R.id.ll);
        LayoutInflater inflater = LayoutInflater.from(this);
        inflater.inflate(R.layout.layout,ll,true);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,TwoActivity.class));
            }
        });
    }
}
