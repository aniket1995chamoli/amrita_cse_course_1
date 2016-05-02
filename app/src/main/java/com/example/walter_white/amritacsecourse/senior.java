package com.example.walter_white.amritacsecourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class senior extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


    }

    public void senior_course(View view)
    {
        String id=null;
        switch(view.getId())
        {
            case (R.id.cse300):
            {
                Intent i=new Intent(this,senior_content.class);
                i.putExtra("id", "cse300");
                startActivity(i);
                break;
            }
            case (R.id.cse330):
            {
                Intent i=new Intent(this,senior_content.class);
                i.putExtra("id", "cse330");
                startActivity(i);
                break;
            }
            case (R.id.cse340):
            {
                Intent i=new Intent(this,senior_content.class);
                i.putExtra("id", "cse340");
                startActivity(i);
                break;
            }
            case (R.id.ece300):
            {
                Intent i=new Intent(this,senior_content.class);
                i.putExtra("id","ece300");
                startActivity(i);
                break;
            }
            case (R.id.cse390):
            {
                Intent i=new Intent(this,senior_content.class);
                i.putExtra("id","cse390");
                startActivity(i);
                break;
            }
            case (R.id.cse391):
            {
                Intent i=new Intent(this,senior_content.class);
                i.putExtra("id","cse391");
                startActivity(i);
                break;
            }
            case (R.id.cse392):
            {
                Intent i=new Intent(this,senior_content.class);
                i.putExtra("id","cse392");
                startActivity(i);
                break;
            }
            case (R.id.cse310):
            {
                Intent i=new Intent(this,senior_content.class);
                i.putExtra("id","cse310");
                startActivity(i);
                break;
            }
            case (R.id.cse320):
            {
                Intent i=new Intent(this,senior_content.class);
                i.putExtra("id","cse320");
                startActivity(i);
                break;
            }
            case (R.id.cse331):
            {
                Intent i=new Intent(this,senior_content.class);
                i.putExtra("id","cse331");
                startActivity(i);
                break;
            }
            case (R.id.cse393):
            {
                Intent i=new Intent(this,senior_content.class);
                i.putExtra("id","cse393");
                startActivity(i);
                break;
            }
            case (R.id.cse394):
            {
                Intent i=new Intent(this,senior_content.class);
                i.putExtra("id","cse394");
                startActivity(i);
                break;
            }
        }

    }

}
