package br.com.senac.novoprojeto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class catalogoActivity extends AppCompatActivity {


    //Declarando variaveis

   RecyclerView idRecCatalogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

    idRecCatalogo = findViewById(R.id.idRecCatalogo);

    //Montagem do layout que será utilizado na lista

        idRecCatalogo.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        //Deixando a lista mais eficiente

        idRecCatalogo.hasFixedSize();

        //Executar a montagem da lita com modelo

        MyAdapter adapter  = new MyAdapter();

        idRecCatalogo.setAdapter(adapter);

    }
}