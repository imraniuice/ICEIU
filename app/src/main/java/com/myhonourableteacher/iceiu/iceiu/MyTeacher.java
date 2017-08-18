package com.myhonourableteacher.iceiu.iceiu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MyTeacher extends AppCompatActivity {
    Button a, b, c, d, e, f, g, h, i, j, k, l, m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_teacher);
        a = (Button) findViewById(R.id.a);
        a.getBackground().setAlpha(60);
        b = (Button) findViewById(R.id.b);
        b.getBackground().setAlpha(60);
        c = (Button) findViewById(R.id.c);
        c.getBackground().setAlpha(60);
        d = (Button) findViewById(R.id.d);
        d.getBackground().setAlpha(60);
        e = (Button) findViewById(R.id.e);
        e.getBackground().setAlpha(60);
        f = (Button) findViewById(R.id.f);
        f.getBackground().setAlpha(60);
        g = (Button) findViewById(R.id.g);
        g.getBackground().setAlpha(60);
        h = (Button) findViewById(R.id.h);
        h.getBackground().setAlpha(60);
        i = (Button) findViewById(R.id.i);
        i.getBackground().setAlpha(60);
        j = (Button) findViewById(R.id.j);
        j.getBackground().setAlpha(60);
        k = (Button) findViewById(R.id.k);
        k.getBackground().setAlpha(60);
        l = (Button) findViewById(R.id.l);
        l.getBackground().setAlpha(60);
        m = (Button) findViewById(R.id.m);
        m.getBackground().setAlpha(60);
    }
    public void Mahbubur(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Dr. Md. Mahbubur Rahman Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Mahbubur.class);
        startActivity(i);
    }
    public void Paresh(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Dr. Paresh Chandra Barman Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Paresh.class);
        startActivity(i);
    }
    public void Tapan(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Dr. Tapan kumar Godder Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Tapan.class);
        startActivity(i);
    }
    public void Zahidul(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Dr. Md. Zahidul Islam Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Zahidul.class);
        startActivity(i);
    }
    public void Tariquzzaman(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Dr. Md. Tariquzzaman Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Tariquzzaman.class);
        startActivity(i);
    }
    public void Shariful(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Dr. Md. Shariful Islam Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Shariful.class);
        startActivity(i);
    }
    public void Ashek(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Md. Ashek Raihan Mahmud Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Ashek.class);
        startActivity(i);
    }
    public void Alamgir(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Md. Alamgir Hossain Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Alamgir.class);
        startActivity(i);
    }
    public void Tarek(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Tarek Hasan Al-Mahmud Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Tarek.class);
        startActivity(i);
    }
    public void Sadek(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Md. Sadek Ali Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Sadek.class);
        startActivity(i);
    }
    public void Sipon(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Md. Sipon Miah Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Sipon.class);
        startActivity(i);
    }
    public void Jashim(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Md. Jashim Uddin Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Jashim.class);
        startActivity(i);
    }
    public void Bikash(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Bikash Chandra Singh Sir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MyTeacher.this, Bikash.class);
        startActivity(i);
    }

}
