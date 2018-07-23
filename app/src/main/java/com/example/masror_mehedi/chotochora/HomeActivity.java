package com.example.masror_mehedi.chotochora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button btnChad,btnKatbirali,btnAmpata,btnTiye,btnKokomoni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnChad = findViewById(R.id.btn_chad);
        btnKatbirali = findViewById(R.id.btn_kat);
        btnAmpata     = findViewById(R.id.btn_ampata);
        btnTiye   = findViewById(R.id.btn_tiye);
        btnKokomoni = findViewById(R.id.btn_kokomoni);


        btnChad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,DetailsActivity.class);

                i.putExtra( "place","Chad Mama");
                Toast.makeText(HomeActivity.this,"Chad Mama",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });

        btnKatbirali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,DetailsActivity.class);

                i.putExtra( "place","Katbirali");
                Toast.makeText(HomeActivity.this,"Katbirali",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });

        btnAmpata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,DetailsActivity.class);

                i.putExtra( "place","Ampata");
                Toast.makeText(HomeActivity.this,"Ampata",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });

        btnTiye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,DetailsActivity.class);

                i.putExtra( "place","Aire Ai Tiye");
                Toast.makeText(HomeActivity.this,"Aire Ai Tiye",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });

        btnKokomoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,DetailsActivity.class);

                i.putExtra( "place","Kokomoni");
                Toast.makeText(HomeActivity.this,"Kokomoni",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });



    }
}



