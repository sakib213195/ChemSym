package com.example.android.chemsym;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        ImageButton flammableliquid = (ImageButton) findViewById(R.id.flammableliquid);

        flammableliquid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



                Toast.makeText(getApplicationContext(),"Combustible liquid that can easily catch fire",Toast.LENGTH_SHORT).show();



            }
        });

        ImageButton flammablesolid = (ImageButton) findViewById(R.id.flammablesolid);

        flammablesolid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



                Toast.makeText(getApplicationContext(),"Flammable solids are any materials in the solid phase of matter that can readily undergo combustion in the presence of a source of ignition.",Toast.LENGTH_SHORT).show();



            }
        });

        ImageButton spontaneoulycombustible = (ImageButton) findViewById(R.id.spontaneoulycombustible);

        spontaneoulycombustible.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



                Toast.makeText(getApplicationContext(),"Material is a liquid or solid that, even in small quantities and without an external ignition source, can ignite within five (5) minutes after coming in contact with air.",Toast.LENGTH_SHORT).show();



            }
        });

        ImageButton dangerouswhenwet = (ImageButton) findViewById(R.id.dangerouswhenwet);

        dangerouswhenwet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



                Toast.makeText(getApplicationContext(),"Water reactive substances are dangerous when wet because they undergo a chemical reaction with water. This reaction may release a gas that is either flammable or presents a toxic health hazard.",Toast.LENGTH_SHORT).show();



            }
        });

        ImageButton oxidisingagent = (ImageButton) findViewById(R.id.oxidisingagent);

        oxidisingagent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



                Toast.makeText(getApplicationContext(),"A substance that can cause or contribute to the combustion of other material.",Toast.LENGTH_SHORT).show();



            }
        });

        ImageButton oxidisingperoxide = (ImageButton) findViewById(R.id.oxidisingperoxide);

        oxidisingperoxide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



                Toast.makeText(getApplicationContext(),"A chemical that readily yields oxygen in reactions, thereby causing or enhancing combustion.",Toast.LENGTH_SHORT).show();



            }
        });

        ImageButton toxic = (ImageButton) findViewById(R.id.toxic);

        toxic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



                Toast.makeText(getApplicationContext(),"Substance which may be harmful to the environment or hazardous to your health if inhaled, ingested or absorbed through the skin.",Toast.LENGTH_SHORT).show();



            }
        });

        ImageButton corrosive = (ImageButton) findViewById(R.id.corrosive);

        corrosive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



                Toast.makeText(getApplicationContext(),"Highly reactive substance that causes obvious damage to living tissue. Corrosives act either directly, by chemically destroying the part (oxidation), or indirectly by causing inflammation.",Toast.LENGTH_SHORT).show();



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
        RadioButton flammableliquidcheck1 = (RadioButton) findViewById(R.id.flammableliquidcheck1);
        RadioButton flammableliquidcheck2 = (RadioButton) findViewById(R.id.flammableliquidcheck2);
        RadioButton flammablesolidcheck1 = (RadioButton) findViewById(R.id.flammablesolidcheck1);
        RadioButton flammablesolidcheck2 = (RadioButton) findViewById(R.id.flammablesolidcheck2);
        RadioButton spontaneoulycombustiblecheck1 = (RadioButton) findViewById(R.id.spontaneoulycombustiblecheck1);
        RadioButton spontaneoulycombustiblecheck2 = (RadioButton) findViewById(R.id.spontaneoulycombustiblecheck2);
        RadioButton dangerouswhenwetcheck1 = (RadioButton) findViewById(R.id.dangerouswhenwetcheck1);
        RadioButton dangerouswhenwetcheck2 = (RadioButton) findViewById(R.id.dangerouswhenwetcheck2);
        RadioButton oxidisingagentcheck1 = (RadioButton) findViewById(R.id.oxidisingagentcheck1);
        RadioButton oxidisingagentcheck2 = (RadioButton) findViewById(R.id.oxidisingagentcheck2);
        RadioButton organicperoxidecheck1 = (RadioButton) findViewById(R.id.organicperoxidecheck1);
        RadioButton organicperoxidecheck2 = (RadioButton) findViewById(R.id.organicperoxidecheck2);
        RadioButton toxiccheck1 = (RadioButton) findViewById(R.id.toxiccheck1);
        RadioButton toxiccheck2 = (RadioButton) findViewById(R.id.toxiccheck2);
        RadioButton corrosivecheck1 = (RadioButton) findViewById(R.id.corrosivecheck1);
        RadioButton corrosivecheck2 = (RadioButton) findViewById(R.id.corrosivecheck2);


        boolean hasflammablecheck1 = flammablecheck1.isChecked();
        boolean hasflammablecheck2 = flammablecheck2.isChecked();
        boolean hasnontoxicflammablegascheck1 = nontoxicflammablegascheck1.isChecked();
        boolean hasnontoxicflammablegascheck2 = nontoxicflammablegascheck2.isChecked();
        boolean hastoxicgascheck1 = toxicgascheck1.isChecked();
        boolean hastoxicgascheck2 = toxicgascheck2.isChecked();
        boolean hasoxidising_gascheck1 = oxidising_gascheck1.isChecked();
        boolean hasoxidising_gascheck2 = oxidising_gascheck2.isChecked();
        boolean hasflammableliquidcheck1 = flammableliquidcheck1.isChecked();
        boolean hasflammableliquidcheck2 = flammableliquidcheck2.isChecked();
        boolean hasflammablesolidcheck1 = flammablesolidcheck1.isChecked();
        boolean hasflammablesolidcheck2 = flammablesolidcheck2.isChecked();
        boolean hasspontaneoulycombustiblecheck1 = spontaneoulycombustiblecheck1.isChecked();
        boolean hasspontaneoulycombustiblecheck2 = spontaneoulycombustiblecheck2.isChecked();
        boolean hasdangerouswhenwetcheck1 = dangerouswhenwetcheck1.isChecked();
        boolean hasdangerouswhenwetcheck2 = dangerouswhenwetcheck2.isChecked();
        boolean hasoxidisingagentcheck1 = oxidisingagentcheck1.isChecked();
        boolean hasoxidisingagentcheck2 = oxidisingagentcheck2.isChecked();
        boolean hasorganicperoxidecheck1 = organicperoxidecheck1.isChecked();
        boolean hasorganicperoxidecheck2 = organicperoxidecheck2.isChecked();
        boolean hastoxiccheck1 = toxiccheck1.isChecked();
        boolean hastoxiccheck2 = toxiccheck2.isChecked();
        boolean hascorrosivecheck1 = corrosivecheck1.isChecked();
        boolean hascorrosivecheck2 = corrosivecheck2.isChecked();


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

        if ((hasflammablecheck1 && hasflammableliquidcheck2) || (hasflammableliquidcheck1 && hasflammablecheck2 )){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasflammablecheck1 && hasflammablesolidcheck2) || (hasflammablesolidcheck1 && hasflammablecheck2 )){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasflammablecheck1 && hasspontaneoulycombustiblecheck2) || (hasspontaneoulycombustiblecheck1 && hasflammablecheck2 )){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasflammablecheck1 && hasdangerouswhenwetcheck2) || (hasdangerouswhenwetcheck1&& hasflammablecheck2 )){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasflammablecheck1 && hasoxidisingagentcheck2) || (hasoxidisingagentcheck1 && hasflammablecheck2 )){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hasflammablecheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck1 && hasflammablecheck2 )){

            Intent compare = new Intent(MainActivity.this, Isolate.class);

            startActivity(compare);

        }

        if ((hasflammablecheck1 && hasoxidising_gascheck2) || (hasoxidising_gascheck1 && hasflammablecheck2 )){

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

        if ((hasnontoxicflammablegascheck1 && hasflammableliquidcheck2) || (hasflammableliquidcheck1 && hasnontoxicflammablegascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasnontoxicflammablegascheck1 && hasflammablesolidcheck2) || (hasflammablesolidcheck1 && hasnontoxicflammablegascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasnontoxicflammablegascheck1 && hasspontaneoulycombustiblecheck2) || (hasspontaneoulycombustiblecheck1 && hasnontoxicflammablegascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasnontoxicflammablegascheck1 && hasdangerouswhenwetcheck2) || (hasdangerouswhenwetcheck1 && hasnontoxicflammablegascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasnontoxicflammablegascheck1 && hasoxidisingagentcheck2) || (hasoxidisingagentcheck1 && hasnontoxicflammablegascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hasnontoxicflammablegascheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck1 && hasnontoxicflammablegascheck2)){

            Intent compare = new Intent(MainActivity.this, Isolate.class);

            startActivity(compare);

        }

        if ((hastoxicgascheck1 && hasflammableliquidcheck2) || (hasflammableliquidcheck1 && hastoxicgascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hastoxicgascheck1 && hasflammablesolidcheck2) || (hasflammablesolidcheck1 && hastoxicgascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hastoxicgascheck1 && hasspontaneoulycombustiblecheck2) || (hasspontaneoulycombustiblecheck1 && hastoxicgascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hastoxicgascheck1 && hasdangerouswhenwetcheck2) || (hasdangerouswhenwetcheck1 && hastoxicgascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hastoxicgascheck1 && hasoxidisingagentcheck2) || (hasoxidisingagentcheck1 && hastoxicgascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hastoxicgascheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck1 && hastoxicgascheck2)){

            Intent compare = new Intent(MainActivity.this, Isolate.class);

            startActivity(compare);

        }

        if ((hasoxidising_gascheck1 && hasflammableliquidcheck2) || (hasflammableliquidcheck1 && hasoxidising_gascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasoxidising_gascheck1 && hasflammablesolidcheck2) || (hasflammablesolidcheck1 && hasoxidising_gascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasoxidising_gascheck1 && hasspontaneoulycombustiblecheck2) || (hasspontaneoulycombustiblecheck1 && hasoxidising_gascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasoxidising_gascheck1 && hasdangerouswhenwetcheck2) || (hasdangerouswhenwetcheck1 && hasoxidising_gascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasoxidising_gascheck1 && hasoxidisingagentcheck2) || (hasoxidisingagentcheck1 && hasoxidising_gascheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hasoxidising_gascheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck1 && hasoxidising_gascheck2)){

            Intent compare = new Intent(MainActivity.this, Isolate.class);

            startActivity(compare);

        }

        if ((hasflammableliquidcheck1 && hasflammableliquidcheck2) || (hasflammableliquidcheck2 && hasflammableliquidcheck1)){

            Intent compare = new Intent(MainActivity.this, OK.class);

            startActivity(compare);

        }

        if ((hasflammableliquidcheck1 && hasflammablesolidcheck2) || (hasflammablesolidcheck1 && hasflammableliquidcheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hasflammableliquidcheck1 && hasspontaneoulycombustiblecheck2) || (hasspontaneoulycombustiblecheck1 && hasflammableliquidcheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasflammableliquidcheck1 && hasdangerouswhenwetcheck2) || (hasdangerouswhenwetcheck1 && hasflammableliquidcheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasflammableliquidcheck1 && hasoxidisingagentcheck2) || (hasoxidisingagentcheck1 && hasflammableliquidcheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasflammableliquidcheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck1 && hasflammableliquidcheck2)){

            Intent compare = new Intent(MainActivity.this, Isolate.class);

            startActivity(compare);

        }

        if ((hasflammablesolidcheck1 && hasflammablesolidcheck2) || (hasflammablesolidcheck2 && hasflammablesolidcheck1)){

            Intent compare = new Intent(MainActivity.this, OK.class);

            startActivity(compare);

        }

        if ((hasflammablesolidcheck1 && hasspontaneoulycombustiblecheck2) || (hasspontaneoulycombustiblecheck1 && hasflammablesolidcheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hasflammablesolidcheck1 && hasdangerouswhenwetcheck2) || (hasdangerouswhenwetcheck1 && hasflammablesolidcheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasflammablesolidcheck1 && hasdangerouswhenwetcheck2) || (hasdangerouswhenwetcheck1 && hasflammablesolidcheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasflammablesolidcheck1 && hasoxidisingagentcheck2) || (hasoxidisingagentcheck1 && hasflammablesolidcheck2)){

            Intent compare = new Intent(MainActivity.this, keepapart.class);

            startActivity(compare);

        }

        if ((hasflammablesolidcheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck1 && hasflammablesolidcheck2)){

            Intent compare = new Intent(MainActivity.this, Isolate.class);

            startActivity(compare);

        }

        if ((hasspontaneoulycombustiblecheck1 && hasspontaneoulycombustiblecheck2) || (hasspontaneoulycombustiblecheck2 && hasspontaneoulycombustiblecheck1)){

            Intent compare = new Intent(MainActivity.this, OK.class);

            startActivity(compare);

        }


        if ((hasspontaneoulycombustiblecheck1 && hasdangerouswhenwetcheck2) || (hasdangerouswhenwetcheck1 && hasspontaneoulycombustiblecheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasspontaneoulycombustiblecheck1 && hasoxidisingagentcheck2) || (hasoxidisingagentcheck1 && hasspontaneoulycombustiblecheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasspontaneoulycombustiblecheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck1 && hasspontaneoulycombustiblecheck2)){

            Intent compare = new Intent(MainActivity.this, Isolate.class);

            startActivity(compare);

        }

        if ((hasdangerouswhenwetcheck1 && hasdangerouswhenwetcheck2) || (hasdangerouswhenwetcheck2 && hasdangerouswhenwetcheck1)){

            Intent compare = new Intent(MainActivity.this, OK.class);

            startActivity(compare);

        }

        if ((hasdangerouswhenwetcheck1 && hasoxidisingagentcheck2) || (hasoxidisingagentcheck1 && hasdangerouswhenwetcheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hasdangerouswhenwetcheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck1 && hasdangerouswhenwetcheck2)){

            Intent compare = new Intent(MainActivity.this, Isolate.class);

            startActivity(compare);

        }




        if ((hasoxidisingagentcheck1 && hasoxidisingagentcheck2) || (hasoxidisingagentcheck2 && hasoxidisingagentcheck1)){

            Intent compare = new Intent(MainActivity.this, maynot.class);

            startActivity(compare);

        }

        if ((hasoxidisingagentcheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck1 && hasoxidisingagentcheck2)){

            Intent compare = new Intent(MainActivity.this, Isolate.class);

            startActivity(compare);

        }

        if ((hasoxidisingagentcheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck1 && hasoxidisingagentcheck2)){

            Intent compare = new Intent(MainActivity.this, Isolate.class);

            startActivity(compare);

        }

        if ((hasorganicperoxidecheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck2 && hasorganicperoxidecheck1)){

            Intent compare = new Intent(MainActivity.this, OK.class);

            startActivity(compare);

        }

        if ((hastoxiccheck1 && hasflammablecheck2) || (hasflammablecheck1 && hastoxiccheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hastoxiccheck1 && hasnontoxicflammablegascheck2) || (hasnontoxicflammablegascheck1 && hastoxiccheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hastoxiccheck1 && hastoxicgascheck2) || (hastoxicgascheck1 && hastoxiccheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hastoxiccheck1 && hasoxidising_gascheck2) || (hasoxidising_gascheck1 && hastoxiccheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hastoxiccheck1 && hasflammableliquidcheck2) || (hasflammableliquidcheck1 && hastoxiccheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hastoxiccheck1 && hasflammablesolidcheck2) || (hasflammablesolidcheck1 && hastoxiccheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hastoxiccheck1 && hasspontaneoulycombustiblecheck2) || (hasspontaneoulycombustiblecheck1 && hastoxiccheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hastoxiccheck1 && hasdangerouswhenwetcheck2) || (hasdangerouswhenwetcheck1 && hastoxiccheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hastoxiccheck1 && hasoxidisingagentcheck2) || (hasoxidisingagentcheck1 && hastoxiccheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hastoxiccheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck1 && hastoxiccheck2)){

            Intent compare = new Intent(MainActivity.this, Isolate.class);

            startActivity(compare);

        }

        if ((hascorrosivecheck1 && hasflammablecheck2) || (hasflammablecheck1 && hascorrosivecheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hascorrosivecheck1 && hasnontoxicflammablegascheck2) || (hasnontoxicflammablegascheck1 && hascorrosivecheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hascorrosivecheck1 && hastoxiccheck2) || (hastoxiccheck1 && hascorrosivecheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hascorrosivecheck1 && hasoxidisingagentcheck2) || (hasoxidisingagentcheck1 && hascorrosivecheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hascorrosivecheck1 && hasflammableliquidcheck2) || (hasflammableliquidcheck1 && hascorrosivecheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hascorrosivecheck1 && hasflammablesolidcheck2) || (hasflammablesolidcheck1 && hascorrosivecheck2)){

            Intent compare = new Intent(MainActivity.this, maynot.class);

            startActivity(compare);

        }

        if ((hascorrosivecheck1 && hasspontaneoulycombustiblecheck2) || (hasspontaneoulycombustiblecheck1 && hascorrosivecheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hascorrosivecheck1 && hasdangerouswhenwetcheck2) || (hasdangerouswhenwetcheck1 && hascorrosivecheck2)){

            Intent compare = new Intent(MainActivity.this, segregate5.class);

            startActivity(compare);

        }

        if ((hascorrosivecheck1 && hasoxidisingagentcheck2) || (hasoxidisingagentcheck1 && hascorrosivecheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hascorrosivecheck1 && hasorganicperoxidecheck2) || (hasorganicperoxidecheck1 && hascorrosivecheck2)){

            Intent compare = new Intent(MainActivity.this, segregate3.class);

            startActivity(compare);

        }

        if ((hascorrosivecheck1 && hascorrosivecheck2) || (hascorrosivecheck2 && hascorrosivecheck1)){

            Toast.makeText(getApplicationContext(),"Error in Input",Toast.LENGTH_SHORT).show();

        }

        if ((hastoxiccheck1 && hascorrosivecheck2) || (hascorrosivecheck1 && hastoxiccheck2)){

            Toast.makeText(getApplicationContext(),"Error in Input. Garbage value will be generated.",Toast.LENGTH_SHORT).show();

        }

        if ((hastoxiccheck2 && hascorrosivecheck1) || (hascorrosivecheck2 && hastoxiccheck1)){

            Toast.makeText(getApplicationContext(),"Error in Input. Garbage value will be generated.",Toast.LENGTH_SHORT).show();

        }





        if ((hastoxiccheck1 && hastoxiccheck2) || (hastoxiccheck2 && hastoxiccheck1)){

            Toast.makeText(getApplicationContext(),"Error in Input",Toast.LENGTH_SHORT).show();


        }



    }



}

