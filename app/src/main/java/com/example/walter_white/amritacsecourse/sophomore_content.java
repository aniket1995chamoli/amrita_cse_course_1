package com.example.walter_white.amritacsecourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class sophomore_content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sophomore_content);
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
        Intent i=getIntent();
        String value;
        value=i.getStringExtra("id");
        if(value.equalsIgnoreCase("mat211"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.mat211_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.mat211_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.mat211_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.mat211_textbook));
            j=(TextView)findViewById(R.id.reference);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference_text);
            j.setVisibility(View.GONE);
            setTitle("MAT211: INTEGRAL TRANSFORM AND COMPLEX ANALYSIS");
        }
        if(value.equalsIgnoreCase("mat220"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.mat220_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.mat220_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.mat220_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.mat220_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.mat220_references));
            setTitle("MAT220: DISCRETE MATHEMATICS");
        }
        if(value.equalsIgnoreCase("cse220"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse220_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse220_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse220_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse220_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse220_reference));
            setTitle("CSE220: OBJECT ORIENTED PROGRAMMING");
        }
        if(value.equalsIgnoreCase("cse210"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse210_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse210_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse210_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse210_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse210_reference));
            setTitle("ECE210: DIGITAL SYSTEMS");
        }
        if(value.equalsIgnoreCase("cse221"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse221_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse221_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse221_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse221_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse221_references));
            setTitle("CSE221: STRUCTURE AND INTERPRETATION OF COMPUTER PROGRAMS");
        }
        if(value.equalsIgnoreCase("cse230"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse230_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse230_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse230_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse230_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse230_reference));
            setTitle("CSE230: DATA STRUCTURES");
        }
}
}
