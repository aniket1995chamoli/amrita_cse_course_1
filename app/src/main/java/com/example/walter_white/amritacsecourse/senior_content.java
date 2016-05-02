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

public class senior_content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_content);
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
        if(value.equalsIgnoreCase("cse300"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse300_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse300_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse300_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse300_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse300_reference));
            setTitle("CSE300: OPERATING SYSTEMS");
        }
        if(value.equalsIgnoreCase("cse330"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse330_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse330_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse330_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse330_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse330_reference));
            setTitle("CSE330: DESIGN AND ANALYSIS OF ALGORITHM");
        }
        if(value.equalsIgnoreCase("cse340"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse340_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse340_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse340_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse340_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse340_reference));
            setTitle("CSE340: DATABASE MANAGEMENT SYSTEMS");
        }
        if(value.equalsIgnoreCase("cse390"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse390_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse390_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(getResources().getString(R.string.cse390_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse390_text));
            j=(TextView)findViewById(R.id.reference);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference_text);
            j.setVisibility(View.GONE);
            setTitle("CSE390: JAVA PROGRAMMING");
        }
        if(value.equalsIgnoreCase("cse391"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse391_unit_1));
            j=(TextView)findViewById(R.id.unit_2);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_3);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_1);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_2);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference_text);
            j.setVisibility(View.GONE);
            setTitle("CSE391: DATABASE MANAGEMENT SYSTEMS LAB");
        }
        if(value.equalsIgnoreCase("cse392"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse392_unit_1));
            j=(TextView)findViewById(R.id.unit_2);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_3);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_1);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_2);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference_text);
            j.setVisibility(View.GONE);
            setTitle("CSE392: OPERATING SYSTEMS LAB");
        }
        if(value.equalsIgnoreCase("cse310"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse310_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse310_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse310_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse310_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse310_reference));
            setTitle("CSE310: COMPUTER NETWORKS");
        }
        if(value.equalsIgnoreCase("cse320"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse320_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse320_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse320_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse320_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse320_reference));
            setTitle("CSE320: SOFTWARE ENGINEERING LAB");
        }
        if(value.equalsIgnoreCase("cse331"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse331_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse331_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse331_unit_3));
            j=(TextView)findViewById(R.id.textbook_1);
            j.setText(this.getString(R.string.cse331_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse331_reference));
            setTitle("CSE331: FORMAL LANGUAGE AND AUTOMATA");
        }
        if(value.equalsIgnoreCase("cse393"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse393_unit_1));
            j=(TextView)findViewById(R.id.unit_2);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_3);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_1);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_2);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference_text);
            j.setVisibility(View.GONE);
            setTitle("CSE393: SOFTWARE ENGINEERING LAB");
        }
        if(value.equalsIgnoreCase("cse394"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse394_unit_1));
            j=(TextView)findViewById(R.id.unit_2);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_3);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_1);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_2);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference_text);
            j.setVisibility(View.GONE);
            setTitle("CSE394: COMPUTER NETWORKS LAB");
        }
        if(value.equalsIgnoreCase("ece300"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.ece300_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.ece300_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.ece300_unit_3));
            j=(TextView)findViewById(R.id.textbook_1);
            j.setText(this.getString(R.string.ece300_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.ece300_reference));
            setTitle("ECE300: INTRODUCTION TO DIGITAL SIGNAL PROCESSING");
        }

    }
}
