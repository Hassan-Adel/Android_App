package com.example.hassan.github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView TheTextView;
    EditText InputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TheTextView = (TextView)findViewById(R.id.TheTextView);
        InputText = (EditText) findViewById(R.id.TheInput);

    }

    public void TheButtonOnClick(View view){
        TheTextView.setText(InputText.getText().toString());
    }


}
