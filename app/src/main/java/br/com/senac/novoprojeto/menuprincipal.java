package br.com.senac.novoprojeto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class menuprincipal extends AppCompatActivity implements View.OnClickListener {

    //Declarando variaveis globais

    CardView cardClient, cardReservation, cardMaintenance, cardSales, cardAccessories, cardCatalog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);

        //Puxando id's do arquivo xml para o java.

        cardClient = findViewById(R.id.cardClient);
        cardReservation = findViewById(R.id.cardReservation);
        cardMaintenance = findViewById(R.id.cardMaintenance);
        cardSales = findViewById(R.id.cardSales);
        cardAccessories = findViewById(R.id.cardAccessories);
        cardCatalog = findViewById(R.id.cardCatalog);

        cardClient.setOnClickListener(this);
        cardReservation.setOnClickListener(this);
        cardMaintenance.setOnClickListener(this);
        cardSales.setOnClickListener(this);
        cardAccessories.setOnClickListener(this);
        cardCatalog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.cardClient:
                startActivity(new Intent(getApplicationContext(), clientesActivity.class));
                break;
            case R.id.cardReservation:
                startActivity(new Intent(getApplicationContext(), reservasActivity.class));
                break;
            case R.id.cardMaintenance:
                startActivity(new Intent(getApplicationContext(), manutencaoActivity.class));
                break;
            case R.id.cardSales:
                startActivity(new Intent(getApplicationContext(), vendasActivity.class));
                break;
            case R.id.cardAccessories:
                startActivity(new Intent(getApplicationContext(), acessoriosActivity.class));
                break;
            case R.id.cardCatalog:
                startActivity(new Intent(getApplicationContext(), catalogoActivity.class));
                break;
        }
    }
};

