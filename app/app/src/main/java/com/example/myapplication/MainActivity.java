package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] alunos = {"Lucas","David","Matheus","Miguel"};
        ListView listaAlunos = (ListView) findViewById(R.id.lvAlunos);
        ArrayAdapter<String> adpter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,alunos);
        listaAlunos.setAdapter(adpter);
    }
}
