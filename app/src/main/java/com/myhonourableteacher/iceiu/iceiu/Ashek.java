package com.myhonourableteacher.iceiu.iceiu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class Ashek extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashek);
        b=(Button)findViewById(R.id.call);
        b.getBackground().setAlpha(60);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01818464047 "));
                startActivity(callIntent);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        });
    }
}
