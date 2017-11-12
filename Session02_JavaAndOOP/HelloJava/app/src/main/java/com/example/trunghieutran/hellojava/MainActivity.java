package com.example.trunghieutran.hellojava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // xuất thông tin
        System.out.print("Hello Java print");
        Log.d("HieuLog", "Hello Android log");

        SinhVien a = new SinhVien();
        a.setTuoi(18);

        System.out.print("Thong tin sv a: " + a.XuatThongTin());
    }
}
