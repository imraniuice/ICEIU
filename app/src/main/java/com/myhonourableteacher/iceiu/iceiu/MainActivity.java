package com.myhonourableteacher.iceiu.iceiu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {
    Button a, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (Button) findViewById(R.id.a);
        a.getBackground().setAlpha(40);
        b= (Button) findViewById(R.id.b);
        b.getBackground().setAlpha(40);
    }
    public void teacher(View v) {
        Toast.makeText(getApplicationContext(), "Go to My Honourable Teacher ID", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this, MyTeacher.class);
        startActivity(i);
    }
    public void stuff(View v) {
        Toast.makeText(getApplicationContext(), "Go to ICE Stuff ID", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this, IceStuff.class);
        startActivity(i);
    }
}
