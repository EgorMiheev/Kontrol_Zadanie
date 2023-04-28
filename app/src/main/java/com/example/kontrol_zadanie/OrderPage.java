package com.example.kontrol_zadanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.kontrol_zadanie.model.Course;
import com.example.kontrol_zadanie.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        ListView orders_list = findViewById(R.id.order_list);

        List<String> coursesTitle = new ArrayList<>();
        for(Course c : MainActivity.fullCoursesList){
            if(Order.items_id.contains(c.getId()))
                coursesTitle.add(c.getTitle());
        }
        orders_list.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Order.items_id.toArray()));
    }
}