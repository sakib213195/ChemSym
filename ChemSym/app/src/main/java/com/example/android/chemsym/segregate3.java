package com.example.android.chemsym;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class segregate3 extends AppCompatActivity {

    MediaPlayer mp;
    Button playBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segregate3);

        playBtn = (Button) findViewById(R.id.playBtn);
        mp = MediaPlayer.create(this, R.raw.segregateone);
    }

    public void onClick(View view) {

        if (!mp.isPlaying()) {
            // Stopping
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);

        } else {
            // Playing
            mp.pause();
            playBtn.setBackgroundResource(R.drawable.play);
        }


    }
}
