package com.tipandroid.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCustom = (Button) findViewById(R.id.btn_custom);
        btnCustom.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final int id = v.getId();
        switch (id){
            case R.id.btn_custom:
                Toast.makeText(this, "this is a Button", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}