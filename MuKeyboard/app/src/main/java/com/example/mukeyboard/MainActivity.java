package com.example.mukeyboard;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnableKeyboard = findViewById(R.id.btnEnableKeyboard);
        btnEnableKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the system's input method settings
                Intent intent = new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS);
                startActivity(intent);
            }
        });
    }
}