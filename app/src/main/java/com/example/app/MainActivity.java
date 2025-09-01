package com.example.app;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        tv=findViewById(R.id.textView);
        tv.setText("blá");
        b.setText("sorteardxcfvgbhnm");


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo_vida", "onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo_vida" ,"onResume");
    }
    @Override
    protected void onPause() {
        super.onPause( );
        Log.d("ciclo_vida" ,"onPause");
    }
}