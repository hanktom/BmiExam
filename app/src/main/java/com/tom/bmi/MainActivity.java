package com.tom.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
    }

    public void bmi(View view) {
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight /(height*height);
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("BMI", bmi);
        startActivity(intent);
    }
}
