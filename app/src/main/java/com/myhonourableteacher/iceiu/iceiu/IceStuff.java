package com.myhonourableteacher.iceiu.iceiu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class IceStuff extends AppCompatActivity {
    Button a, b, c, d, e, f, g, h, i, j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_stuff);
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
    }
    public void Shahidul(View v) {
        Toast.makeText(getApplicationContext(), "See Details About MD. Shahidul Islam", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(IceStuff.this, Shahidul.class);
        startActivity(i);
    }
    public void Selim(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Selim Ahmed", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(IceStuff.this, Selim.class);
        startActivity(i);
    }
    public void Azadur(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Azadur Rahman", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(IceStuff.this, Azadur.class);
        startActivity(i);
    }
    public void Muktadir(View v) {
        Toast.makeText(getApplicationContext(), "See Details About  MD. Abu Muktadir", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(IceStuff.this, Muktadir.class);
        startActivity(i);
    }
    public void Jahurul(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Amirul Islam", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(IceStuff.this, Jahurul.class);
        startActivity(i);
    }
    public void Rubina(View v) {
        Toast.makeText(getApplicationContext(), "See Details About MD. Jahurul Islam", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(IceStuff.this, Rubina.class);
        startActivity(i);
    }
    public void Fotik(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Rubina Islam", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(IceStuff.this, Fotik.class);
        startActivity(i);
    }
    public void Mobarek(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Gias Uddin Fotik", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(IceStuff.this, Mobarek.class);
        startActivity(i);
    }
    public void Jahangir(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Mobarek Hossain", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(IceStuff.this, Jahangir.class);
        startActivity(i);
    }
    public void Amirul(View v) {
        Toast.makeText(getApplicationContext(), "See Details About Jahangir Hossain", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(IceStuff.this, Amirul.class);
        startActivity(i);
    }
}
