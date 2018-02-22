package com.example.seb.liste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        TextView affichage = (TextView) findViewById(R.id.sporttext); //on crée un textview qui contiendra notre texte
        Intent intent = getIntent();

        String donnees = intent.getStringExtra("EXTRA_RESULT"); //on récupère les données qu'on avait envoyé précédemment
        switch (donnees){ //on affiche le texte en fonction de la donnée qu'on a cliqué sur la page précédente.
            case "F1":
                affichage.setText(R.string.F1);
                break;
            case "Foot":
                affichage.setText(R.string.Foot);
                break;
            case "Waterpolo":
                affichage.setText(R.string.Waterpolo);
                break;





        }








    }
}
