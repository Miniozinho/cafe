package com.example.basico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 int ze = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mais(View view){
        TextView textView = findViewById(R.id.texto);
        ze++;
        textView.setText("" + ze);
        TextView ola = findViewById(R.id.total);
        int a = ze *3;
        ola.setText("Preço total = R$"+a+",00");

    }

    public void menos(View view){
        TextView quant = findViewById(R.id.texto);
        ze--;
        quant.setText("" + ze);
        TextView ola = findViewById(R.id.total);
        int a = ze *3;
        ola.setText("Preço total = R$"+a+",00");
    }


}
