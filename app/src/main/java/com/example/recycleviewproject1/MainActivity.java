package com.example.recycleviewproject1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecylcerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mlayoutManager;
    String Lol= "Resurants";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ArrayList<RecyclerItem> recyclerItems = new ArrayList<>();
        recyclerItems.add(new RecyclerItem(R.drawable.img,"Buffalo","",R.drawable.reaval));
        recyclerItems.add(new RecyclerItem(R.drawable.bogie,"Cafe Bogie"," ",R.drawable.reunaval));
        recyclerItems.add(new RecyclerItem(R.drawable.kabajee,"Kabajee","",R.drawable.reaval));
        recyclerItems.add(new RecyclerItem(R.drawable.tandoor,"Tandoor"," ",R.drawable.reunaval));
        recyclerItems.add(new RecyclerItem(R.drawable.img,"Buffalo","Reservation available",R.drawable.reunaval));
        recyclerItems.add(new RecyclerItem(R.drawable.kabajee,"Kabajee","Reservation uneavailable ",R.drawable.reaval));


        mRecylcerView = findViewById(R.id.recyclerview);
        mRecylcerView.setHasFixedSize(true);
        mlayoutManager = new LinearLayoutManager(this);
        mAdapter= new RecyclerAdaper(recyclerItems);
        mRecylcerView.setLayoutManager(mlayoutManager);
        mRecylcerView.setAdapter(mAdapter);

    }
}

