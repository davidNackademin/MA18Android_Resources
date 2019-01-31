package com.example.david.langandresources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloView = findViewById(R.id.textView);

    }

    public void buttonPressed(View view) {



        helloView.setText(getString(R.string.good_bye));


    }



}
