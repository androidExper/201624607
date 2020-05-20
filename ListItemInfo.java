package com.example.myapplication9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListItemInfo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected_item);

        Intent item =getIntent();

        Button button=findViewById(R.id.btn_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        TextView view=findViewById(R.id.food_name);
        String itemName=item.getStringExtra("itemName");
        view.setText(itemName+" selected");


        int nut1=item.getIntExtra()/2000;
        int nut2=item.getIntExtra()/310;
        int nut3=item.getIntExtra()/72;
        int nut4=item.getIntExtra()/48;

        ProgressBar progressBar1=findViewById(R.id.progressBar1);
        ProgressBar progressBar2=findViewById(R.id.progressBar2);
        ProgressBar progressBar3=findViewById(R.id.progressBar3);
        ProgressBar progressBar4=findViewById(R.id.progressBar4);
        progressBar1.setProgress(nut1*100);
        progressBar2.setProgress(nut2*100);
        progressBar3.setProgress(nut3*100);
        progressBar4.setProgress(nut4*100);

    }
}
