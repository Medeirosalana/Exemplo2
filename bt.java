package com.example.alana.exemplo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class bt extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bt1);
        TextView txt = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        Bundle parametros = intent.getExtras();
        String usuario = parametros.getString("usuario");
        txt.setText("Ola" + usuario);
    }
}
