package com.example.seb.liste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.seb.liste.R.id.listView;
import static com.example.seb.liste.R.styleable.View;

public class MainActivity extends AppCompatActivity {


    private ListView mListView; //on crée une classe listview
    private String[] prenoms = new String[]{ //on remplit un tableau avec le nom de nos sports
            "F1", "Foot", "Waterpolo"
    };









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView mListView = (ListView) findViewById(listView); //on fait référence à notre listview

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, prenoms); //on crée un arrayadapter pour pouvoir donner à notre liste les valeurs dans le tableau
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) { //condition qui s'active quand on clique

                String Result = (String) mListView.getItemAtPosition(position); //on récupère la valeur dans le tableau correspondant à l'endroit du clic
               goToNextActivity(Result); //on appelle la fonction gotonextactivity en lui donnant la valeur qu'on a cliqué





            }


        });

    }


    private void goToNextActivity(String result){







        Intent MonIntent = new Intent(MainActivity.this,SportsActivity.class); //on crée notre intent et on récupère la valeur cliquée dans un extra

            MonIntent.putExtra("EXTRA_RESULT",result);





        //on va à la prochaine activité
        startActivity(MonIntent);


    }


}
//Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_LONG).show();