package com.example.walter_white.amritacsecourse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fresher_content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresher_content);
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
        if(value.equalsIgnoreCase("mat111"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.mat111_unit1_text));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.mat111_unit2_text));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.mat111_unit3_text));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.mat111_textbook_1));
            j=(TextView)findViewById(R.id.textbook_1);
            j.setText(this.getString(R.string.mat111_textbook_2));
            j=(TextView)findViewById(R.id.reference);
            j.setVisibility(View.GONE);
            setTitle("MAT111: CALCULUS, MATRIX ALGEBRA AND ORDINARY DIFFERENTIAL EQUATIONS");
        }
        if(value.equalsIgnoreCase("eee100"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.eee100_unit1_text));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.eee100_unit2_text));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.eee100_unit3_text));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.eee100_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.eee100_references));
            setTitle("EEE100: ELECTRICAL ENGINEERING");
        }
        if(value.equalsIgnoreCase("mec100"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.mec100_unit1_text));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.mec100_unit2_text));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.mec100_unit3_text));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.mec100_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.mec100_references));
            setTitle("MEC100: ENGINEERING MECHANICS");
        }
        if(value.equalsIgnoreCase("mec181"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.mec181_unit1_text));
            j=(TextView)findViewById(R.id.unit_2);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_3);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.mec181_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.mec181_references));
            setTitle("MEC181: ENGINEERING DRAWING");
        }
        if(value.equalsIgnoreCase("chy181"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.chy181_unit_1));
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
            setTitle("CHY181: CHEMISTRY LAB");
        }
        if(value.equalsIgnoreCase("eee180"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.eee180_unit_1));
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
            setTitle("EEE180: WORKSHOP B");

        }
        if(value.equalsIgnoreCase("cul101"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cul101_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cul101_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cul101_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cul101_textbook));
            j=(TextView)findViewById(R.id.reference);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference_text);
            j.setVisibility(View.GONE);
            setTitle("CUL101: CULTURAL EDUCATION");
        }
        if(value.equalsIgnoreCase("eng112"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.eng112_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.eng112_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j=(TextView)findViewById(R.id.textbook);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_1);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_2);
            j.setVisibility(View.GONE);
            j.setText(this.getString(R.string.eng112_unit_3));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.eng112_reference));
            setTitle("ENG112: TECHNICAL COMMUNICATION");
        }
        if(value.equalsIgnoreCase("phy100"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.phy100_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.phy100_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.phy100_unit_3));
            j=(TextView)findViewById(R.id.textbook_1);
            j.setText(this.getString(R.string.phy100_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.phy100_reference));
            setTitle("PHY100: PHYSICS");
        }
        if(value.equalsIgnoreCase("mat112"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.mat112_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.mat112_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.mat112_unit_3));
            j=(TextView)findViewById(R.id.textbook_1);
            j.setText(this.getString(R.string.mat112_textbook));
            j=(TextView)findViewById(R.id.reference);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference_text);
            j.setVisibility(View.GONE);
            setTitle("MAT112: VECTOR CALCULUS,FOURIER SERIES AND PARTIAL DIFFERETIAL EQUATIONS");
        }
        if(value.equalsIgnoreCase("ece100"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.ece100_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.ece100_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.ece100_unit_3));
            j=(TextView)findViewById(R.id.textbook_1);
            j.setText(this.getString(R.string.ece100_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.ece100_refernce));
            setTitle("ECE100: ELECTRONICS ENGINEERING");
        }
        if(value.equalsIgnoreCase("cse100"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse100_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse100_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse100_unit_3));
            j=(TextView)findViewById(R.id.textbook_1);
            j.setText(this.getString(R.string.cse100_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse100_references));
            setTitle("CSE100: COMPUTER PROGRAMMING");
        }
        if(value.equalsIgnoreCase("mec180"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.mec180_unit_1));
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
            setTitle("MEC180: WORKSHOP A");

        }
        if(value.equalsIgnoreCase("mec182"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.mec182_unit_1));
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
            setTitle("MEC182: COMPUTER AIDEED DRAWING");
        }
        if(value.equalsIgnoreCase("phy181"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.phy181_unit_1));
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
            setTitle("PHY181: PHYSICS LAB");
        }
        if(value.equalsIgnoreCase("cse180"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse180_unit_1));
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
            setTitle("CSE180: COMPUTER PROGRAMMING LAB");
        }
        if(value.equalsIgnoreCase("cul102"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cul102_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cul102_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(getResources().getString(R.string.cul102_unit_3));
            j=(TextView)findViewById(R.id.textbook_1);
            j.setText(getResources().getString(R.string.cul102_textbook));
            j=(TextView)findViewById(R.id.reference);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference_text);
            j.setVisibility(View.GONE);
            setTitle("CUL102: CULTURAL EDUCATION II");
        }
    }


}
