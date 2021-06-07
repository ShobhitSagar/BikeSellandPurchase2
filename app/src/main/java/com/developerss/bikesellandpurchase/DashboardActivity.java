package com.developerss.bikesellandpurchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void sellBike(View view) {
        Intent intent = new Intent(DashboardActivity.this, SellActivity.class);
        startActivity(intent);
        finish();
    }
}