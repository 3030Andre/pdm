package com.example.app;



import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button b;
    int i =0;
    EditText edmin, edmax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        tv=findViewById(R.id.tvresultado);
        edmin = findViewById(R.id.edmin);
        edmax = findViewById (R.id.edmax);



       //tratamento de evento
        b.setOnClickListener(v -> {
            Integer minimo = Integer.parseInt(edmin.getText().toString());
            Integer maximo = Integer.parseInt(edmax.getText().toString());
            Random random= new Random();

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.VANILLA_ICE_CREAM) {
                int r=random.nextInt(minimo, maximo);
                tv.setText(Integer.toString(r));
            }


        });
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