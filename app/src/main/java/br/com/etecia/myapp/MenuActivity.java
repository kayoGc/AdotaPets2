package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    MaterialCardView idMenuPets, idMenuParceiros, idMenuServicos, idMenuLocalizar, idMenuAlimentos, idMenuDoacoes;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idMenuPets = findViewById(R.id.cardPets);
        idMenuParceiros = findViewById(R.id.cardParceiros);
        idMenuServicos = findViewById(R.id.cardServicos);
        idMenuLocalizar = findViewById(R.id.cardLocalizar);
        idMenuAlimentos = findViewById(R.id.cardAlimentos);
        idMenuDoacoes = findViewById(R.id.cardDoacoes);

        idMenuPets.setOnClickListener(this);
        idMenuDoacoes.setOnClickListener(this);
        idMenuAlimentos.setOnClickListener(this);
        idMenuServicos.setOnClickListener(this);
        idMenuLocalizar.setOnClickListener(this);
        idMenuParceiros.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cardPets:
                startActivity(new Intent(getApplicationContext(), PetsActivity.class));
                break;
            case R.id.cardAlimentos:
                startActivity(new Intent(getApplicationContext(), AlimentosActivity.class));
                break;
            case R.id.cardDoacoes:
                startActivity(new Intent(getApplicationContext(), DoacoesActivity.class));
                break;
            case R.id.cardLocalizar:
                startActivity(new Intent(getApplicationContext(), LocalizarActivity.class));
                break;
            case R.id.cardParceiros:
                startActivity(new Intent(getApplicationContext(), ParceirosActivity.class));
                break;
            case R.id.cardServicos:
                startActivity(new Intent(getApplicationContext(), ServicosActivity.class));
                break;
        }

    }
}