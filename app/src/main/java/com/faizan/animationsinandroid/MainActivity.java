package com.faizan.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txthello;
    private TextView txthi;
    private boolean  isHelloWorldShowing;
    private ImageView imglion;
    private ImageView imgleopard;
    private boolean isLoinShowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imglion = findViewById(R.id.imglion);
        imgleopard = findViewById(R.id.imgleopard);
        txthello =findViewById(R.id.txthello);
        txthi = findViewById(R.id.texthi);
        txthello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Log.i("Button Tag"," Button tapped!");

                if(isHelloWorldShowing){

                    txthello.animate().alpha(0f).setDuration(3000);
                    txthi.animate().alpha(1f).setDuration(3000);
                    isHelloWorldShowing = false;
                }
                else if(!isHelloWorldShowing){

                    txthello.animate().alpha(1f).setDuration(3000);

                    txthi.animate().alpha(0f).setDuration(3000);

                    isHelloWorldShowing = true;
                }

            }
        });

        imglion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Chocha billa", Toast.LENGTH_SHORT).show();
                if(isLoinShowing){

                    imglion.animate().alpha(0f).setDuration(4000);
                    imgleopard.animate().alpha(1f).setDuration(4000);
                    isLoinShowing = false;

                }
                else if(!isLoinShowing){
                    imgleopard.animate().alpha(0f).setDuration(4000);
                    imglion.animate().alpha(1f).setDuration(4000);
                    isLoinShowing = true;

                }

            }
        });


    }
}