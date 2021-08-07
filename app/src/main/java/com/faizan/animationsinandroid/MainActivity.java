package com.faizan.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txthello;
    private TextView txthi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txthello =findViewById(R.id.txthello);
        txthi = findViewById(R.id.texthi);
        txthello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Log.i("Button Tag"," Button tapped!");
                txthello.animate().alpha(0f).setDuration(3000);
                txthi.animate().alpha(1f).setDuration(3000);
            }
        });
    }
}