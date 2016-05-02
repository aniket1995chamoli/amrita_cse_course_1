package com.example.walter_white.amritacsecourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Fresher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresher);
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

    public void fresher_course(View view) {
        String id = null;
        switch (view.getId()) {
            case (R.id.eng111): {
                Intent i = new Intent(this, eng111.class);
                startActivity(i);
                break;
            }
            case (R.id.chy100): {
                Intent i = new Intent(this, chy100.class);
                startActivity(i);
                break;
            }
            case (R.id.mat111): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "mat111");
                startActivity(i);
                break;
            }
            case (R.id.eee100): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "eee100");
                startActivity(i);
                break;
            }
            case (R.id.mec100): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "mec100");
                startActivity(i);
                break;
            }
            case (R.id.mec181): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "mec181");
                startActivity(i);
                break;
            }
            case (R.id.chy181): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "chy181");
                startActivity(i);
                break;
            }
            case (R.id.eee180): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "eee180");
                startActivity(i);
                break;
            }
            case (R.id.cul101): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "cul101");
                startActivity(i);
                break;
            }
            case (R.id.eng112): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "eng112");
                startActivity(i);
                break;
            }
            case (R.id.phy100): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "phy100");
                startActivity(i);
                break;
            }
            case (R.id.mat112): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "mat112");
                startActivity(i);
                break;
            }
            case (R.id.ece100): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "ece100");
                startActivity(i);
                break;
            }
            case (R.id.cse100): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "cse100");
                startActivity(i);
                break;
            }
            case (R.id.mec180): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "mec180");
                startActivity(i);
                break;
            }
            case (R.id.mec182): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "mec182");
                startActivity(i);
                break;
            }
            case (R.id.phy181): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "phy181");
                startActivity(i);
                break;
            }
            case (R.id.cse180): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "cse180");
                startActivity(i);
                break;
            }
            case (R.id.cul102): {
                Intent i = new Intent(this, Fresher_content.class);
                i.putExtra("id", "cul102");
                startActivity(i);
                break;
            }
        }

    }



}
