package com.example.android.chemsym;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton flammable = (ImageButton) findViewById(R.id.flamamble);

        flammable.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Flammable is a property of a material relating how easily the material ignites or sustains a combustion reaction.",Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton nontoxicflammablegas = (ImageButton) findViewById(R.id.nontoxicflammablegas);

        nontoxicflammablegas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Gases that can displace atmospheric oxygen causing asphyxiation. These materials are often storedunder pressure causing an additional hazard. Examples include nitrogen, carbondioxide and oxygen.",Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toxicgas = (ImageButton) findViewById(R.id.toxicgas);

        toxicgas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Gases that are liable to cause death if inhaled, for example, chlorine gas and anhydrous ammonia.",Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton oxidising_gas = (ImageButton) findViewById(R.id.oxidising_gas);

        oxidising_gas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



                Toast.makeText(getApplicationContext(),"Any gas which may, generally by providing oxygen, cause or contribute to the combustion of other material more than air does.",Toast.LENGTH_SHORT).show();



            }
        });


    }

    public void compare (View view){

        RadioButton flammablecheck1 = (RadioButton) findViewById(R.id.flammablecheck1);
        RadioButton flammablecheck2 = (RadioButton) findViewById(R.id.flammablecheck2);
        RadioButton nontoxicflammablegascheck1 = (RadioButton) findViewById(R.id.nontoxicflammablegascheck1);
        RadioButton nontoxicflammablegascheck2 = (RadioButton) findViewById(R.id.nontoxicflammablegascheck2);
        RadioButton toxicgascheck1 = (RadioButton) findViewById(R.id.toxicgascheck1);
        RadioButton toxicgascheck2 = (RadioButton) findViewById(R.id.toxicgascheck2);
        RadioButton oxidising_gascheck1 = (RadioButton) findViewById(R.id.oxidising_gascheck1);
        RadioButton oxidising_gascheck2 = (RadioButton) findViewById(R.id.oxidising_gascheck2);

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

