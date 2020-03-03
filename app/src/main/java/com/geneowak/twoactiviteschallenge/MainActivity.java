package com.geneowak.twoactiviteschallenge;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_PASSAGE = "com.geneowak.twoactivitieschallenge.extra.passage";
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(View view) {
        Log.d(LOG_TAG, "Clicked button of id: " + view.getId());
        String passage = "";
        switch (view.getId()) {
            case R.id.text_one:
                passage = getString(R.string.passage_1);
                break;
            case R.id.text_two:
                passage = getString(R.string.passage_2);
                break;
            case R.id.text_three:
                passage = getString(R.string.passage_3);
                break;
        }
        Log.d(LOG_TAG, "Showing passage: " + passage);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_PASSAGE, passage);
        startActivity(intent);
    }
}
