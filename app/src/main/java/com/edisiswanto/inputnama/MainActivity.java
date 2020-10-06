package com.edisiswanto.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText TextName;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextName = findViewById(R.id.TextName);
        Result = findViewById(R.id.ResultText);

    }

    public void TampilNama(View view) {
        Result.setText("Nama Anda: " + TextName.getText());
    }
}