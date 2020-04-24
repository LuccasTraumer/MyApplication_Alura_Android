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
        // ArrayAdapter vai transformar as string em Views, e recebe como parametro o "contexto" ou Tela que será exibida
        // o modelo que será apresentado e em quem ele deve aplicar esse modelo. O tipo generic é o tipo que os dados estão vindo
        listaAlunos.setAdapter(adpter);
    }
}
