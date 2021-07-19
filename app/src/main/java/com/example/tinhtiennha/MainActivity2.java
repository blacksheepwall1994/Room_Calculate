package com.example.tinhtiennha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        this.setContentView(R.layout.activity_main2);

        String sonuocbfstring = getIntent().getExtras().getString("wtbf");
        String sonuocnwstring = getIntent().getExtras().getString("wtnw");
        String sodienbfstring = getIntent().getExtras().getString("elecbf");
        String sodiennwstring = getIntent().getExtras().getString("elecnw");
        String roomname = String.valueOf(MainActivity.item);

        TextView nametv = findViewById(R.id.name);
        TextView electv = findViewById(R.id.electv);
        TextView watertv = findViewById(R.id.watertv);
        TextView in = findViewById(R.id.tongnumber);

        int sonuoc= (Integer.parseInt(sonuocnwstring)-Integer.parseInt(sonuocbfstring))*20;
        float sodien=(Float.parseFloat(sodiennwstring)-Float.parseFloat(sodienbfstring))  * (float)3.3;
        float SUM = sonuoc + sodien + MainActivity.giaphong + 50;
        String nuocstr= "(" + sonuocnwstring + " -" + sonuocbfstring + ")x20= " + sonuoc;
        String dienstr= "(" + sodiennwstring + " - " + sodienbfstring + ")x3.3= " + sodien;

        TextView phongboxprice = findViewById(R.id.phongboxprice);
        String tongstr = String.valueOf(SUM);
        String phongboxpricestr= String.valueOf(MainActivity.giaphong);
        electv.setText(dienstr);
        watertv.setText(nuocstr);
        in.setText(tongstr);
        nametv.setText(roomname);
        phongboxprice.setText(phongboxpricestr);
//        dtb dtb = new dtb (MainActivity.this);
    }
}