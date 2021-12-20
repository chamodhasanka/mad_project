package com.example.mobilehousecard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class PayViaCash extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay_via_cash);
    }

    public void GetHome(View view) {
        Intent intent = new Intent(PayViaCash.this, View_Additems.class);
        startActivity(intent);
    }
}
