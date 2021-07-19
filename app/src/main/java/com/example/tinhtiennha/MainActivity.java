package com.example.tinhtiennha;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.os.Bundle;

import android.view.Window;
import android.view.WindowManager;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity{
    static int giaphong;
    static String item;
    private Spinner spinner;
    Button count;
    private static final String[] paths = {"3.1", "3.2", "4.1", "4.2","5.1", "5.2","6.1", "6.2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        count = (Button)findViewById(R.id.count);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.paths, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        giaphong=2700;
                        break;
                    case 1:
                        giaphong=3200;
                        break;
                    case 2:
                        giaphong=2600;
                        break;
                    case 3:
                        giaphong=2600;
                        break;
                    case 4:
                        giaphong=2600;
                        break;
                    case 5:
                        giaphong=2600;
                        break;
                    case 6:
                        giaphong=2500;
                        break;
                    case 7:
                        giaphong=2500;
                        break;
                }
                item =(String) parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText sonuocbfstring=(EditText)findViewById(R.id.waterbfbox);
                EditText sodienbfstring=(EditText)findViewById(R.id.elecbfbox);
                EditText sonuocnwstring=(EditText)findViewById(R.id.waternwbox);
                EditText sodiennwstring=(EditText)findViewById(R.id.elecnwbox);
                if(sonuocnwstring.getText().toString().matches("") || sodiennwstring.getText().toString().matches("")|| sonuocbfstring.getText().toString().matches("")|| sodienbfstring.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this,"Bạn chưa nhập số điện hoặc nước",Toast.LENGTH_SHORT).show();
                    return;
                }

//        dtb dtb = new dtb (MainActivity.this);
                Intent intent = new  Intent(MainActivity.this,MainActivity2.class);
                //TextView edttenphong = (TextView)findViewById(R.id.edttenphong);
                String wtbf=sonuocbfstring.getText().toString();
                String wtnw=sonuocnwstring.getText().toString();
                String elecbf=sodienbfstring.getText().toString();
                String elecnw = sodiennwstring.getText().toString();
                intent.putExtra("wtbf", wtbf);
                intent.putExtra("wtnw", wtnw);
                intent.putExtra("elecbf", elecbf);
                intent.putExtra("elecnw", elecnw);
                //edttenphong.setText(item);
                startActivity(intent);
            }
        });

    }



}

//
//    @Override
//    public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory) {
//        return super.openOrCreateDatabase(name, mode, factory);
//    }
