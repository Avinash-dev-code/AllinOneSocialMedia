package com.example.socialmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.Reclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getBaseContext(),2));
        int Icons[]={R.drawable.facebook,R.drawable.insta,R.drawable.snapchat_icon,R.drawable.linkedin,R.drawable.messenger,R.drawable.spotify,R.drawable.twitter,R.drawable.youtube};
        recyclerView.setAdapter(new SocialAdapter(Icons));





        }
        }