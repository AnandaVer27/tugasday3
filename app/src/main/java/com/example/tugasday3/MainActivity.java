package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btndetail1, btndetail2, btndetail3, btndetail4, btndetail5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndetail1 = (Button) findViewById(R.id.btndetail1);
        btndetail2 = (Button) findViewById(R.id.btndetail2);
        btndetail3 = (Button) findViewById(R.id.btndetail3);
        btndetail4 = (Button) findViewById(R.id.btndetail4);
        btndetail5 = (Button) findViewById(R.id.btndetail5);

        btndetail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaActivity2 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(BukaActivity2);
            }
        });

        btndetail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { BukaActivity3(); }
        });

        btndetail3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) { BukaActivity4(); }
        }));

        btndetail4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { BukaActivity5(); }
        });

        btndetail5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { BukaActivity6(); }
        });

    }

    public void BukaActivity3(){
        Intent BukaActivity3 = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(BukaActivity3);
    }

    public void BukaActivity4(){
        Intent BukaActivity4 = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(BukaActivity4);
    }

    public void BukaActivity5() {
        Intent BukaActivity5 = new Intent(getApplicationContext(), MainActivity5.class);
        startActivity(BukaActivity5);
    }

    public void BukaActivity6() {
        Intent BukaActivity6 = new Intent(getApplicationContext(), MainActivity6.class);
        startActivity(BukaActivity6);
    }
}