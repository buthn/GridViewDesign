package com.example.mydesign2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.GridView;

import com.example.mydesign2.data_res.ProdectList;
import com.example.mydesign2.data_res.ProductAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         gridView = findViewById(R.id.grv_id);
        ArrayList<ProdectList> productArray = new ArrayList<ProdectList>();

        productArray.add(new ProdectList(R.drawable.car1,"Toyota","2000"));
        productArray.add(new ProdectList(R.drawable.car3,"mercedes","30000"));
        productArray.add(new ProdectList(R.drawable.car6,"car name","30000"));
        productArray.add(new ProdectList(R.drawable.car5,"car name","30000"));
        productArray.add(new ProdectList(R.drawable.car7,"car name","30000"));
        productArray.add(new ProdectList(R.drawable.car8,"car name","30000"));

        ProductAdapter adapter = new ProductAdapter(this,productArray );
        gridView.setAdapter(adapter);


    }
}