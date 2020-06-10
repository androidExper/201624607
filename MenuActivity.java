package com.example.myapplication9;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;


import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);

        BarChart barChart=findViewById(R.id.barchart);


        ArrayList entries=new ArrayList();
        entries.add(new Entry(4f,1));
        entries.add(new Entry(8f,4));
        entries.add(new Entry(9f,5));
        entries.add(new Entry(18f, 9));


        ArrayList day= new ArrayList();

        BarDataSet bardataset=new BarDataSet(entries, "NOthing");
        barChart.animateY(1000);
        BarData data=new BarData(day, bardataset);
        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.setData(data);


    }




}
