package com.example.xotristeza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView tvNumero;
    Button btFeliz;
    TextView btZerar;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        tvNumero = findViewById(R.id.tvNumero);
        btFeliz = findViewById(R.id.btFeliz);
        btZerar = findViewById(R.id.btZerar);

        btFeliz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                Log.d("Teste Contador", "onClick: Clicou! " + contador);
                tvNumero.setText(String.valueOf(contador));

                switch (contador) {
                    case 10:
                        imageView.setImageResource(R.drawable.smile02);
                        break;
                    case 20:
                        imageView.setImageResource(R.drawable.smile03);
                        break;
                    case 30:
                        imageView.setImageResource(R.drawable.smile04);
                        break;
                    case 40:
                        imageView.setImageResource(R.drawable.smile05);
                        break;
                    case 50:
                        imageView.setImageResource(R.drawable.smile06);
                        break;
                    case 60:
                        imageView.setImageResource(R.drawable.smile07);
                        break;
                    case 70:
                        imageView.setImageResource(R.drawable.smile08);
                        break;
                    case 80:
                        imageView.setImageResource(R.drawable.smile09);
                        break;
                    case 90:
                        imageView.setImageResource(R.drawable.smile10);
                        break;
                    case 100:
                        imageView.setImageResource(R.drawable.smile11);
                        break;
                }
            }
        });
    }

    public void zerarTudo(View view) {
        contador = 0;

        tvNumero.setText(String.valueOf(contador));
        imageView.setImageResource(R.drawable.smile01);

        Toast.makeText(this, "Recursos zerados com sucesso!", Toast.LENGTH_SHORT).show();
    }
}