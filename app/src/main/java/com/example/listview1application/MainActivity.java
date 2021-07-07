package com.example.listview1application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

        private ListView mlistMonth;
       String[] months;
    /*String [] cities={"Mumbbai","Pune","Kolkata","Delhi","Chennai",
               "Bangalore","Hyderabad","Pune","Kolhapur","Surat",
                              "Indore","Nashik",
               "Mumbbai","Pune","Kolkata","Delhi","Chennai"};*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistMonth=findViewById(R.id.listMonth);
       months=new DateFormatSymbols().getMonths();
        //ArrayAdapter<String> monthAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,months);
        ArrayAdapter<String> monthAdapter=new ArrayAdapter<>(this, R.layout.activity_list,months);
        mlistMonth.setAdapter(monthAdapter);

        mlistMonth.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //String month=parent.getItemAtPosition(position).toString();
//String month=months[position];
        //String month=((TextView)view).getText().toString();
        String month=mlistMonth.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(),"Item clicked is "+month,Toast.LENGTH_LONG).show();
    }
}