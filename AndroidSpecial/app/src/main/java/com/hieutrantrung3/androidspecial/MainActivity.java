package com.hieutrantrung3.androidspecial;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String GetDenstity(Context context)
    {
        int density = getResources().getDisplayMetrics().densityDpi;

        switch(density)
        {
            case DisplayMetrics.DENSITY_LOW:
                return  "LDPI";
//                break;
            case DisplayMetrics.DENSITY_MEDIUM:
                return  "MDPI";
//                break;
            case DisplayMetrics.DENSITY_HIGH:
                return  "HDPI";
//                break;
            case DisplayMetrics.DENSITY_XHIGH:
                return  "XHDPI";
//                break;
        }
        return  "defautl";
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String den  = GetDenstity(getApplicationContext());
        ((TextView)findViewById(R.id.txt)).setText(den);

        Log.d("HieuLog", "hello");


    }
}
