package com.example.myapplication;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    EditText editText;
    Button button;
    ArrayList<String> nomes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.editTextText);
        nomes = new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
          android.R.layout.simple_list_item_1, nomes);
        ListView.setAdapter(adapter);
        buttonSalvar.setOnClickListener(view v -> {
            nomes.add(editText.getText().toString());
            adapter.notify();
            ContactsContract.DataSetChanged();
        })

    }
}