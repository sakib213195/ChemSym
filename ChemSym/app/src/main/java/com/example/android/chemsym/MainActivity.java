package com.example.android.chemsym;

import android.content.Intent;

import android.graphics.drawable.Drawable;
import android.media.FaceDetector;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import 	java.util.Scanner;
import android.view.View;


public class MainActivity extends AppCompatActivity {

Button button;
ImageView imageView;
static  final int CAM_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView Process = (TextView) findViewById(R.id.Process);


        Process.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent Process = new Intent(MainActivity.this, Process.class);


                startActivity(Process);
            }
        });

        button = (Button) findViewById(R.id.cambutton1);
        imageView = (ImageView) findViewById(R.id.image_view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camera_intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);
                File file = getFile();
                camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
                startActivityForResult(camera_intent, CAM_REQUEST);



            }
        });



    }


    private File getFile()
    {
        File folder = new File("sdcard/ChemSym");

        if((folder.exists()))
        {
            folder.mkdir();
        }

        File image_file = new File(folder,"ChemSym.jpg");
        return image_file;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String path = "sdcard/ChemSym/ChemSym.jpg";
        imageView.setImageDrawable(Drawable.createFromPath(path));


    }






}
