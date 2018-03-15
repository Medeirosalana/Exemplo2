package com.example.alana.exemplo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrar();
            }
        });

    }
    private void entrar(){
        Intent intent = new Intent(this, bt.class);
        Bundle parametros = new Bundle();
        parametros.putString("usuario"," ");
        intent.putExtras(parametros);
        startActivity(intent);

    }
}
