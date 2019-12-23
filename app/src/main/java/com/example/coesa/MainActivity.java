package com.example.coesa;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity  {

    LinearLayout primaryitem;
    Button btn_apply,btn_cancel;
    Animation fade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primaryitem=(LinearLayout)findViewById(R.id.primaryitem);
        btn_apply=(Button)findViewById(R.id.btn_apply);
        btn_cancel=(Button)findViewById(R.id.btn_cancel);

        fade= AnimationUtils.loadAnimation(this,R.anim.fade);

        btn_apply.setAlpha(0);
        btn_cancel.setAlpha(0);
        btn_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,president.class));
            }
        });


        primaryitem.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    primaryitem.setBackground(getDrawable(R.drawable.bg_item_selected));
                    btn_apply.setAlpha(1);
                    btn_cancel.setAlpha(1);
                    btn_apply.startAnimation(fade);
                }
            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    primaryitem.setBackground(getDrawable(R.drawable.bg_item));
                }
                btn_apply.setAlpha(0);
                btn_cancel.setAlpha(0);
            }

        });



    }
}
