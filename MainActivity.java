package com.example.marzian.myapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.widget.CalendarView;
import android.widget.Toast;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


public class MainActivity extends AppCompatActivity{
    CalendarView cal;
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal = (CalendarView) findViewById(R.id.calendarView);
        final String date;



        //Datenbank erstellen, falls noch nicht erstellt









        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {

                month++;    //weil Januar = 0, Februar = 1 ....


                String datum = Integer.toString(dayOfMonth) + "." +  Integer.toString(month) + "." + Integer.toString(year);

                    Intent sendIntent = new Intent(MainActivity.this, BerichtEintragenActivity.class);
                    sendIntent.putExtra("DATUM",datum);
                    startActivity(sendIntent);
            }
        });
    }
}
