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

public class final_content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_content);
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
        if(value.equalsIgnoreCase("cse400"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse400_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse400_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse400_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse400_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse400_reference));
            setTitle("CSE400: COMPUTER GRAPHICS AND VISUALISATION");
        }
        if(value.equalsIgnoreCase("cse421"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse421_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse421_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse421_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse421_textbook));
            j=(TextView)findViewById(R.id.reference);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference_text);
            j.setVisibility(View.GONE);
            setTitle("CSE421: NET-CENTRIC PROGRAMMING");
        }
        if(value.equalsIgnoreCase("cse430"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse430_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setText(getResources().getString(R.string.cse430_unit_2));
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setText(this.getString(R.string.cse430_unit_3));
            j=(TextView)findViewById(R.id.textbook_2);
            j.setText(this.getString(R.string.cse430_textbook));
            j=(TextView)findViewById(R.id.reference_text);
            j.setText(this.getString(R.string.cse430_reference));
            setTitle("CSE430: COMPUTER LANGUAGE ENGINEERING");
        }
        if(value.equalsIgnoreCase("cse490"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse490_unit_1));
            j=(TextView)findViewById(R.id.unit_2_text);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_3);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_2);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.unit_3_text);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_1);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.textbook_2);
            j.setVisibility(View.GONE);
            j=(TextView)findViewById(R.id.reference_text);
            j.setVisibility(View.GONE);
            setTitle("CSE490: COMPUTER GRAPHICS AND VISUALISATION LAB");
        }
        if(value.equalsIgnoreCase("cse491"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse491_unit_1));
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
            setTitle("CSE491: COMPUTER LANGUAGE ENGINEERING LAB");
        }
        if(value.equalsIgnoreCase("cse497"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse497_unit_1));
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
            setTitle("CSE497: SEMINAR");
        }
        if(value.equalsIgnoreCase("cse499"))
        {
            View namebar = this.findViewById(R.id.obj);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            namebar = this.findViewById(R.id.obj_text);
            ((ViewGroup) namebar.getParent()).removeView(namebar);
            TextView j=(TextView)findViewById(R.id.unit_1_text);
            j.setText(getResources().getString(R.string.cse499_unit_1));
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
            setTitle("CSE449 PROJECT");
        }
    }
}
