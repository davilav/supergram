package com.supergram.supergram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.supergram.supergram.Views.ContainerActivity;
import com.supergram.supergram.Views.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount (View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
    public void goHome (View view){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
}
