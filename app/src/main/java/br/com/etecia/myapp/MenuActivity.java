package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

        idMenuPets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


    @Override
    public void onClick(View v) {

    }
}