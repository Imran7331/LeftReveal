package com.example.leftreveal.swipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.leftreveal.R;

import java.util.ArrayList;

public class SwipeSelection extends AppCompatActivity {
    RecyclerView recyclerView;
    SwipeAdaptor adapter;
    ArrayList<Employee> employees = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_selection);
        recyclerView = (RecyclerView) findViewById(R.id.swip_rv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        adapter = new SwipeAdaptor(this, employees);
        recyclerView.setAdapter(adapter);

        createList();

    }
    private void createList() {
        employees = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Employee employee = new Employee();
            employee.setName("Employee " + (i + 1));
            employees.add(employee);
        }
        adapter.setEmployees(employees);
    }
}