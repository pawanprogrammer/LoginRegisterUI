package com.trishasofttech.loginregisterui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /*declare the java objects*/
    Button btn_login, btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*to hide the actionbar*/
        //getSupportActionBar().hide();
        /*initialize the java objects from xml widget/components*/
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);

        /*code with optimization*/
        btn_register.setOnClickListener(this);
        btn_login.setOnClickListener(this);


        /*click on the button*/
        /*code without optimization*/
        /*btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                *//*switch between Activity/pages*//*
                Intent login = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(login);
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                *//*switch between Activity/pages*//*
                Intent register = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(register);
            }
        });*/


    }

    @Override
    public void onClick(View view) {
        /*click on the button*/
        switch (view.getId())
        {
            case R.id.btn_login:
                Intent login = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(login);
                break;
            case R.id.btn_register:
                Intent register = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(register);
                break;
            default:
        }
    }
}