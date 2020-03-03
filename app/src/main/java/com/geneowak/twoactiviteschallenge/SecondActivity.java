package com.geneowak.twoactiviteschallenge;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView passageView = findViewById(R.id.passage_view);
        // get the intent that started the activity
        Intent intent = getIntent();
        String passage = intent.getStringExtra(MainActivity.EXTRA_PASSAGE);
        passageView.setText(passage);
    }
}
