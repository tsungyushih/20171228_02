package com.example.student.a20171228_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
      Intent it = new Intent();
      it.setAction("Frank123");
      it = Intent.createChooser(it,"乾!快選啦!");
      startActivity(it);
    }
}
