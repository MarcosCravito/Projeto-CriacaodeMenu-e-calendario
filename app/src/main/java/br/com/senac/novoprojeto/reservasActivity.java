package br.com.senac.novoprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class reservasActivity extends AppCompatActivity {


    //Declarando variaveis globais a serem usadas

    DatePicker dtpReservar;
    FloatingActionButton fabReservar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservas);

        fabReservar = findViewById(R.id.FloatingActionButtonReservar);
        dtpReservar = findViewById(R.id.dtpReservar);

        fabReservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Reserva realizada com sucesso !",
                        Toast.LENGTH_LONG).show();
            }
        });

        int mes = dtpReservar.getMonth();
        int dia = dtpReservar.getDayOfMonth();
        int ano = dtpReservar.getYear();

        String montagem = "Você está no" + dia + "/" + mes + "/" + ano;
    }
}