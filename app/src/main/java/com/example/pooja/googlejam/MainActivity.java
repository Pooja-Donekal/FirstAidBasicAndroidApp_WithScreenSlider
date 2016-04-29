package com.example.pooja.googlejam;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView lv;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       final String[] treatments={"Ankle Sprain","Dizziness","Hand Fracture","Head Injury","Convulsions"};
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String> al=new ArrayAdapter<String>(this,R.layout.itemrow,treatments);
        lv.setAdapter(al);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // Display a Toast message indicting the selected item
                if(position==0) {
                     i = new Intent(MainActivity.this, AnkleSprain.class);
                    Toast.makeText(getApplicationContext(), treatments[position], Toast.LENGTH_LONG).show();
                }
                if(position==1) {
                     i = new Intent(MainActivity.this, Dizziness.class);
                    Toast.makeText(getApplicationContext(), treatments[position], Toast.LENGTH_LONG).show();
                }
                if(position==2) {
                    i = new Intent(MainActivity.this, HandFracture.class);
                    Toast.makeText(getApplicationContext(), treatments[position], Toast.LENGTH_LONG).show();
                }
                if(position==3) {
                    i = new Intent(MainActivity.this, HeadInjury.class);
                    Toast.makeText(getApplicationContext(), treatments[position], Toast.LENGTH_LONG).show();
                }
                if(position==4) {
                    i = new Intent(MainActivity.this, Convulsions.class);
                    Toast.makeText(getApplicationContext(), treatments[position], Toast.LENGTH_LONG).show();
                }
                startActivity(i);

            }
        });
        }



}
