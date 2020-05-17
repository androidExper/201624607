package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    int imageIndex=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gravity);

        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
    }

    public void onButton1Clicked(View v){
        changeImage();
    }
    private void changeImage(){
        if(imageIndex==0){
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);

            imageIndex=1;
        }
        else if(imageIndex==1){
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageIndex=0;
        }
    }
    /*public void onButton1Clicked(View v){
        Toast.makeText(this, "회원가입이 되었습니다.", Toast.LENGTH_LONG).show();
    }

    public void onButton2Clicked(View v){
        Toast.makeText(this, "로그인이 되었습니다", Toast.LENGTH_LONG).show();
    }*/
}
