package com.example.walter_white.amritacsecourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class sophomore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sophomore);
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

    public void sophomore_course(View view)
    {
        String id=null;
        switch(view.getId())
        {
            case (R.id.mat211):
            {
                Intent i=new Intent(this,sophomore_content.class);
                i.putExtra("id", "mat211");
                startActivity(i);
                break;
            }
            case (R.id.mat220):
            {
                Intent i=new Intent(this,sophomore_content.class);
                i.putExtra("id", "mat220");
                startActivity(i);
                break;
            }
            case (R.id.cse220):
            {
                Intent i=new Intent(this,sophomore_content.class);
                i.putExtra("id", "cse220");
                startActivity(i);
                break;
            }
            case (R.id.cse210):
            {
                Intent i=new Intent(this,sophomore_content.class);
                i.putExtra("id","cse210");
                startActivity(i);
                break;
            }
            case (R.id.cse221):
            {
                Intent i=new Intent(this,sophomore_content.class);
                i.putExtra("id","cse221");
                startActivity(i);
                break;
            }
            case (R.id.cse230):
            {
                Intent i=new Intent(this,sophomore_content.class);
                i.putExtra("id","cse230");
                startActivity(i);
                break;
            }

        }

    }

}
