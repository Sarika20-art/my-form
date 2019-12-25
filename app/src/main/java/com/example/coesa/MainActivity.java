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

    private LinearLayout primaryitem,secondaryitem,thirditem,fouritem,fiveitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primaryitem=(LinearLayout)findViewById(R.id.primaryitem);
        secondaryitem = (LinearLayout) findViewById(R.id.secondaryitem);
        thirditem=(LinearLayout)findViewById(R.id.thirditem);
        fouritem=(LinearLayout) findViewById(R.id.fouritem);
        fiveitem=(LinearLayout) findViewById(R.id.fiveitem);

        primaryitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preque();
            }
        });
        secondaryitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seque();
            }
        });
        thirditem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hopque();
            }
        });
        fouritem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thque();
            }
        });
        fiveitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emque();
            }
        });

    }

    public void preque()
    {
        Intent intent=new Intent(this,PresidentForm.class);
        startActivity(intent);
    }
    public void seque()
    {
        Intent intent=new Intent(this,SecretaryForm.class);
        startActivity(intent);
    }
    public void hopque()
    {
        Intent intent=new Intent(this,HeadOfPanel.class);
        startActivity(intent);
    }
    public void thque()
    {
        Intent intent=new Intent(this,TechnicalHead.class);
        startActivity(intent);
    }
    public void emque()
    {
        Intent intent=new Intent(this,EventManager.class);
        startActivity(intent);
    }

}
