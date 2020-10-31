package com.example.fincare_svn_latest_screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view;
    List<Product> productList;
    TextView tv_count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            tv_count = (TextView) findViewById(R.id.tv_count);

            recycler_view = (RecyclerView) findViewById(R.id.recycler_view);
            recycler_view.setHasFixedSize(true);
            recycler_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));

            //initializing the productlist
            productList = new ArrayList<>();
            //adding some items to our list
            productList.add(
                    new Product(
                            1,
                            "Fast Track",
                            50,
                            R.drawable.img_watch));

            productList.add(
                    new Product(
                            2,
                            "Sonata",
                            60,
                            R.drawable.img_watch));

            productList.add(
                    new Product(
                            3,
                            "Rolex",
                            60,
                            R.drawable.img_watch));

            productList.add(
                    new Product(
                            4,
                            "Rolex",
                            60,
                            R.drawable.img_watch));

            productList.add(
                    new Product(
                            5,
                            "Rolex",
                            60,
                            R.drawable.img_watch));

            productList.add(
                    new Product(
                            6,
                            "Rolex",
                            60,
                            R.drawable.img_watch));

            tv_count.setText(productList.size()+"");
            final RecyclerAdapter adapter = new RecyclerAdapter(this, productList);
            recycler_view.setAdapter(adapter);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
