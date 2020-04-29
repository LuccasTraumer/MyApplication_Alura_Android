package com.example.myapplication;

import android.app.Activity;
import android.widget.EditText;
import android.widget.RatingBar;

import com.example.myapplication.modelo.Aluno;

public class FormularioHelper {


    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoTelefone;
    private final EditText campoSite;
    private final RatingBar campoNota;

    public FormularioHelper(FormularioActivity activity) {
         campoNome = (EditText)activity.findViewById(R.id.etNome);
         campoEndereco = (EditText)activity.findViewById(R.id.etEndereco);
         campoTelefone = (EditText)activity.findViewById(R.id.etTelefone);
         campoSite = (EditText)activity.findViewById(R.id.etSite);
         campoNota = (RatingBar)activity.findViewById(R.id.rbNota);

    }

    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));

        return aluno;
    }
}
