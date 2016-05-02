package com.example.walter_white.amritacsecourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class finals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finals);
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

    public void final_course(View view)
    {
        String id=null;
        switch(view.getId())
        {
            case (R.id.cse400):
            {
                Intent i=new Intent(this,final_content.class);
                i.putExtra("id", "cse400");
                startActivity(i);
                break;
            }
            case (R.id.cse421):
            {
                Intent i=new Intent(this,final_content.class);
                i.putExtra("id", "cse421");
                startActivity(i);
                break;
            }
            case (R.id.cse430):
            {
                Intent i=new Intent(this,final_content.class);
                i.putExtra("id", "cse430");
                startActivity(i);
                break;
            }
            case (R.id.cse490):
            {
                Intent i=new Intent(this,final_content.class);
                i.putExtra("id","cse490");
                startActivity(i);
                break;
            }
            case (R.id.cse491):
            {
                Intent i=new Intent(this,final_content.class);
                i.putExtra("id","cse491");
                startActivity(i);
                break;
            }
            case (R.id.cse497):
            {
                Intent i=new Intent(this,final_content.class);
                i.putExtra("id","cse497");
                startActivity(i);
                break;
            }
            case (R.id.cse499):
            {
                Intent i=new Intent(this,final_content.class);
                i.putExtra("id","cse499");
                startActivity(i);
                break;
            }

        }

    }
}
