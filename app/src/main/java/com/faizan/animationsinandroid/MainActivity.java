package com.faizan.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
    private TextView  txtAndroid;
    private Button btnAnimate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imglion = findViewById(R.id.imglion);
        imgleopard = findViewById(R.id.imgleopard);
        txthello =findViewById(R.id.txthello);
        txthi = findViewById(R.id.texthi);
        txtAndroid = findViewById(R.id.txtAndroid);
        btnAnimate = findViewById(R.id.btnAnimate);

        txthello.setX(2000);
        txthi.setX(-2000);
        txtAndroid.setY(-3000);

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

                    imglion.animate().alpha(0f).setDuration(2000);
                    imgleopard.animate().alpha(1f).setDuration(2000);
                    isLoinShowing = false;

                }
                else if(!isLoinShowing){
                    imgleopard.animate().alpha(0f).setDuration(2000);
                    imglion.animate().alpha(1f).setDuration(2000);
                    isLoinShowing = true;

                }

            }
        });

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                txtAndroid.animate().translationX(1500).setDuration(9000);
//                txtAndroid.animate().rotation(360).setDuration(9000);

                txtAndroid.animate().rotationX(400).translationY(-2000).setDuration(8000);

            }
        });

        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txthello.animate().translationXBy(-2000).rotation(360).setDuration(4000);
                txthi.animate().translationXBy(2150).alpha(1f).setDuration(4000);
                txtAndroid.animate().translationYBy(3000).scaleX(1).setDuration(4000);
            }
        });



    }
}