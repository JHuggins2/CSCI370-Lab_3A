package com.example.advancedadapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private StudentAdapter studentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.student);

        ArrayList<Student> studentList = new ArrayList<Student>(){
            {
                add(new Student("John", "Smith", "ECON"));
                add(new Student("Jim", "Matthews", "CSCI"));
                add(new Student("Adam", "Johnson", "HIST"));
                add(new Student("Mary", "White", "ENGL"));
                add(new Student("Sam", "Michaels", "CITA"));
            }
        };

        studentAdapter = new StudentAdapter(getApplicationContext(), studentList);

        listView.setAdapter(studentAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Short Click", Toast.LENGTH_SHORT).show();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),  "Long Click", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }
}