package com.example.android.chemsym;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton flammable = (ImageButton) findViewById(R.id.flamamble);

        flammable.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent flammable = new Intent(MainActivity.this, flammablegas.class);


                startActivity(flammable);
            }
        });

        ImageButton nontoxicflammablegas = (ImageButton) findViewById(R.id.nontoxicflammablegas);

        nontoxicflammablegas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent nontoxicflammablegas = new Intent(MainActivity.this, nonflamamblenontoxicgas.class);


                startActivity(nontoxicflammablegas);
            }
        });

        ImageButton toxicgas = (ImageButton) findViewById(R.id.toxicgas);

        toxicgas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent toxicgas = new Intent(MainActivity.this, toxicgas.class);


                startActivity(toxicgas);
            }
        });

        ImageButton oxidising_gas = (ImageButton) findViewById(R.id.oxidising_gas);

        oxidising_gas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent oxidising_gas = new Intent(MainActivity.this, oxidisinggas.class);


                startActivity(oxidising_gas);
            }
        });

    }

    public void compare (View view){

        CheckBox flammablecheck1 = (CheckBox) findViewById(R.id.flammablecheck1);
        CheckBox flammablecheck2 = (CheckBox) findViewById(R.id.flammablecheck2);
        CheckBox nontoxicflammablegascheck1 = (CheckBox) findViewById(R.id.nontoxicflammablegascheck1);
        CheckBox nontoxicflammablegascheck2 = (CheckBox) findViewById(R.id.nontoxicflammablegascheck2);
        CheckBox toxicgascheck1 = (CheckBox) findViewById(R.id.toxicgascheck1);
        CheckBox toxicgascheck2 = (CheckBox) findViewById(R.id.toxicgascheck2);
        CheckBox oxidising_gascheck1 = (CheckBox) findViewById(R.id.oxidising_gascheck1);
        CheckBox oxidising_gascheck2 = (CheckBox) findViewById(R.id.oxidising_gascheck2);

        boolean hasflammablecheck1 = flammablecheck1.isChecked();
        boolean hasflammablecheck2 = flammablecheck2.isChecked();
        boolean hasnontoxicflammablegascheck1 = nontoxicflammablegascheck1.isChecked();
        boolean hasnontoxicflammablegascheck2 = nontoxicflammablegascheck2.isChecked();
        boolean hastoxicgascheck1 = toxicgascheck1.isChecked();
        boolean hastoxicgascheck2 = toxicgascheck2.isChecked();
        boolean hasoxidising_gascheck1 = oxidising_gascheck1.isChecked();
        boolean hasoxidising_gascheck2 = oxidising_gascheck2.isChecked();


        if (hasflammablecheck1 && hasflammablecheck2){

            Intent flammable1 = new Intent(MainActivity.this, OK.class);

            startActivity(flammable1);

        }

        if (hasflammablecheck1 && hasnontoxicflammablegascheck2){

            Intent compare = new Intent(MainActivity.this, OK.class);

            startActivity(compare);

        }

        if (hasflammablecheck1 && hastoxicgascheck2){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if (hasnontoxicflammablegascheck1 && hasflammablecheck2){

            Intent compare = new Intent(MainActivity.this, OK.class);

            startActivity(compare);

        }

        if (hasnontoxicflammablegascheck1 && hasnontoxicflammablegascheck2){

            Intent compare = new Intent(MainActivity.this, OK.class);

            startActivity(compare);

        }

        if (hasnontoxicflammablegascheck1 && hastoxicgascheck2){

            Intent compare = new Intent(MainActivity.this, OK.class);

            startActivity(compare);

        }

        if (hastoxicgascheck1 && hasflammablecheck2){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if (hastoxicgascheck1 && hasnontoxicflammablegascheck2){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if (hastoxicgascheck1 && hastoxicgascheck2){

            Intent compare = new Intent(MainActivity.this, maynot.class);

            startActivity(compare);

        }

        if ((hasflammablecheck1 && hasoxidising_gascheck2) || (hasoxidising_gascheck1 && hasflammablecheck2 )){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hasnontoxicflammablegascheck1 && hasoxidising_gascheck2) || (hasoxidising_gascheck1 && hasnontoxicflammablegascheck2) ) {

            Intent compare = new Intent(MainActivity.this, OK.class);

            startActivity(compare);

        }

        if ((hastoxicgascheck1 && hasoxidising_gascheck2) || (hasoxidising_gascheck1 && hastoxicgascheck2) ){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hasoxidising_gascheck1 && hasoxidising_gascheck2) || (hasoxidising_gascheck2 && hasoxidising_gascheck1)){

            Intent compare = new Intent(MainActivity.this, OK.class);

            startActivity(compare);

        }








    }



}

