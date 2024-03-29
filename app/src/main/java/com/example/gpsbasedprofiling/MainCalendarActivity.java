package com.example.gpsbasedprofiling;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gpsbasedprofiling.Customcalender.MyCalendarView;

public class MainCalendarActivity extends AppCompatActivity implements MyCalendarView.OnDateSetListener {
    MyCalendarView myCalendarView;
TextView txttextchkin, txtchkout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincalendar);
        txttextchkin=(TextView)findViewById(R.id.txttextchkin);
        txttextchkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myCalendarView = MyCalendarView.getInstance(MainCalendarActivity.this,true);

                myCalendarView.setOnDateSetListener(MainCalendarActivity.this);
                myCalendarView.setMinMaxHijriYear(1430, 1450);

                myCalendarView.setMinMaxGregorianYear(2013, 2020);
                myCalendarView.setMode(MyCalendarView.Mode.Gregorian);
                myCalendarView.setUILanguage(MyCalendarView.Language.English);
//                myCalendarView.setDaysOfWeekTextColor(getResources().getColor(R.color.orange_light));
//                myCalendarView.setDatePickerMonthlyDaysBckground(getResources().getColor(R.color.orange_light));
//                        .setDefaultHijriDate(8, 0, 1437)//months start from 0
                myCalendarView.setEnableScrolling(false);

                myCalendarView.showDialog();
                myCalendarView.show();

            }
        });


        txtchkout=(TextView)findViewById(R.id.txtchkout);
        txtchkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myCalendarView = MyCalendarView.getInstance(MainCalendarActivity.this,true);

                myCalendarView.setOnDateSetListener(MainCalendarActivity.this);
                myCalendarView.setMinMaxHijriYear(1430, 1450);

                myCalendarView.setMinMaxGregorianYear(2013, 2020);
                myCalendarView.setMode(MyCalendarView.Mode.Gregorian);
                myCalendarView.setUILanguage(MyCalendarView.Language.English);
//                myCalendarView.setDaysOfWeekTextColor(getResources().getColor(R.color.orange_light));
//                myCalendarView.setDatePickerMonthlyDaysBckground(getResources().getColor(R.color.orange_light));
//                        .setDefaultHijriDate(8, 0, 1437)//months start from 0
                myCalendarView.setEnableScrolling(false);

                myCalendarView.showDialog();
                myCalendarView.show();


            }
        });









/*

        myCalendarView = MyCalendarView.getInstance(MainCalendarActivity.this,true);

        myCalendarView.setOnDateSetListener(MainCalendarActivity.this);
        myCalendarView.setMinMaxHijriYear(1430, 1450);

        myCalendarView.setMinMaxGregorianYear(2013, 2020);
        myCalendarView.setMode(MyCalendarView.Mode.Gregorian);
        myCalendarView.setUILanguage(MyCalendarView.Language.English);
//                myCalendarView.setDaysOfWeekTextColor(getResources().getColor(R.color.orange_light));
//                myCalendarView.setDatePickerMonthlyDaysBckground(getResources().getColor(R.color.orange_light));
//                        .setDefaultHijriDate(8, 0, 1437)//months start from 0
        myCalendarView.setEnableScrolling(true);
        myCalendarView.showDialog();
        myCalendarView.show();
*/




        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myCalendarView = MyCalendarView.getInstance(MainCalendarActivity.this,true);

                myCalendarView.setOnDateSetListener(MainCalendarActivity.this);
                myCalendarView.setMinMaxHijriYear(1430, 1450);

                myCalendarView.setMinMaxGregorianYear(2013, 2020);
                myCalendarView.setMode(MyCalendarView.Mode.Gregorian);
                myCalendarView.setUILanguage(MyCalendarView.Language.English);
//                myCalendarView.setDaysOfWeekTextColor(getResources().getColor(R.color.orange_light));
//                myCalendarView.setDatePickerMonthlyDaysBckground(getResources().getColor(R.color.orange_light));
//                        .setDefaultHijriDate(8, 0, 1437)//months start from 0
                myCalendarView.setEnableScrolling(false);

                myCalendarView.showDialog();
                myCalendarView.show();

            }
        });

        ((Button) findViewById(R.id.button22)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myCalendarView = MyCalendarView.getInstance(MainCalendarActivity.this,true);

                myCalendarView.setOnDateSetListener(MainCalendarActivity.this);
                myCalendarView.setMinMaxHijriYear(1430, 1450);
                myCalendarView.setMinMaxGregorianYear(2013, 2020);
                myCalendarView.setMode(MyCalendarView.Mode.Hijri);
                myCalendarView.setUILanguage(MyCalendarView.Language.Arabic);
//                        .setDefaultHijriDate(8, 0, 1437)//months start from 0
                myCalendarView.setEnableScrolling(false);

                myCalendarView.showDialog();
                myCalendarView.show();

            }
        });
    }

    @Override
    public void onDateSet(int year, int month, int day, int hour, int minute, int seconds, String ampm) {
        ((TextView) findViewById(R.id.txtchkin)).setText(day + "/" + (month) + "/" + year);
        //((TextView) findViewById(R.id.txtchkout)).setText(day + "/" + (month) + "/" + year);
    }
}
