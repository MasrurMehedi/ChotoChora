package com.example.masror_mehedi.chotochora;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgPlace;
    TextView textName;

    Button btnPlay,btnPause,btnStop;
    MediaPlayer player1,player2,player3,player4;
    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imgPlace = findViewById(R.id.img_place);
        textName = findViewById(R.id.text_name);

        //for audio
        btnPlay = findViewById(R.id.bnt_play);
        btnPause = findViewById(R.id.btn_pause);
        btnStop = findViewById(R.id.btn_stop);

        player1 = MediaPlayer.create(DetailsActivity.this,R.raw.aireai);
        player2 = MediaPlayer.create(DetailsActivity.this,R.raw.chadutece);
        player3 = MediaPlayer.create(DetailsActivity.this,R.raw.chadotece);

        String getPlace = getIntent().getExtras().getString("place");

        Log.d("place",getPlace);//for Log
        if (getPlace.equals("Chad"))
        {


            imgPlace.setImageResource(R.drawable.chad);

            textName.setText(R.string.chad_desc);
            //for audio
            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(isPlaying==false)
                    {
                        player1.start();

                        isPlaying = true;
                    }
                }
            });

            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (isPlaying==true)
                    {
                        player1.pause();

                        isPlaying = false;
                        player1.setLooping(true);
                    }
                }
            });

            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (isPlaying==true)
                    {
                        player1.stop();

                        isPlaying = false;
                    }
                    DetailsActivity.this.finish();

                }
            });




        }
        else if (getPlace.equals("Katbirali")){
            imgPlace.setImageResource(R.drawable.katbirali);

            textName.setText(R.string.kat_desc);

            //for audio
            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(isPlaying==false)
                    {
                        player3.start();

                        isPlaying = true;
                    }
                }
            });

            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (isPlaying==true)
                    {
                        player3.pause();

                        isPlaying = false;
                        player2.setLooping(true);
                    }
                }
            });

            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (isPlaying==true)
                    {
                        player3.stop();

                        isPlaying = false;
                    }
                    DetailsActivity.this.finish();

                }
            });



        }
        else if (getPlace.equals("Ampata")){
            imgPlace.setImageResource(R.drawable.ampata);
            textName.setText(R.string.am_desc);
        }
        else if (getPlace.equals("Aire Ai Tiye")){
            imgPlace.setImageResource(R.drawable.aire);
            textName.setText(R.string.aire_desc);

            //for audio
            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(isPlaying==false)
                    {
                        player2.start();

                        isPlaying = true;
                    }
                }
            });

            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (isPlaying==true)
                    {
                        player2.pause();

                        isPlaying = false;
                        player2.setLooping(true);
                    }
                }
            });

            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (isPlaying==true)
                    {
                        player2.stop();

                        isPlaying = false;
                    }
                    DetailsActivity.this.finish();

                }
            });


        }


        else {
            imgPlace.setImageResource(R.drawable.kokomoni);

            textName.setText(R.string.koko_desc);
        }



    }
}


