package com.example.desenvolvimento_02.cdi_roboguice;

import android.widget.EditText;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

/**
 * Created by desenvolvimento-02 on 02/02/16.
 */
public class FirstClass2 extends RoboActivity{

    @InjectView(R.id.editTextNome) private EditText nome;
    @InjectView(R.id.editTextIdade) private EditText idade;

    public String verifiIdade() {
        int old = Integer.parseInt(idade.getText().toString());

        if(old >= 18) {
            return nome.getText().toString()+" é maior de idade";
        }else {
            return nome.getText().toString()+" é menor de idade";
        }
    }
}
