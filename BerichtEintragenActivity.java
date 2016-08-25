package com.example.marzian.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BerichtEintragenActivity extends AppCompatActivity {
    EditText datumEditText;
    Button buttonSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bericht_eintragen);

        datumEditText = (EditText) findViewById(R.id.editText);
        buttonSave = (Button) findViewById(R.id.buttonSave);
        String datumString;

        Intent intent = getIntent();
        String datum = intent.getStringExtra("DATUM");
        DateFormat originalFormat = new SimpleDateFormat("dd.MM.yyyy");

        Date x = new Date();
        try {
            x = originalFormat.parse(datum);    //Damit es als DATE-Format in der Datenbank gespeichert werden kann
        }catch (ParseException pe){

        }

        datumString = originalFormat.format(x);
        datumEditText.setText(datumString);

        buttonSave.setOnClickListener(
                    new buttonSave.OnClickListener(){
                        public void OnClick(View v){

                        }
                    }
        );

    }
}
