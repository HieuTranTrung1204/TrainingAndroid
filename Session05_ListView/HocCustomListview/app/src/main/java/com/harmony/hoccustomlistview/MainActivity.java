package com.harmony.hoccustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvDanhBa;              //Adapter View
    private DanhBaAdapter adapter;          //Adapter
    private ArrayList<DanhBa> listDanhBa;   //Datasource

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cách custom listview
        /*
        1. Phải tạo ra được 1 dòng của view mình mong muốn
        VD: Làm 1 cái dòng cho danh bạ
            - 1 cái ảnh đại diện
            - 1 cái tên
            - 1 cái SĐT

         2. Tạo ra 1 object để tương tác với nó

         3. Tạo ra 1 adapter

         4.Tạo ra Datasource
         */

        //Ánh xạ control listview
        lvDanhBa = (ListView) findViewById(R.id.lvDanhBa);

        //tạo ra datasoure bằng ArrayList
        listDanhBa = new ArrayList<>();
        //Các loại thuộc tính với R có kiểu dữ liệu là int
        //ví dụ ở đây hình thuộc drawable có kiểu int
        //R.drawable.ic_account_circle_black_24dp : kiểu int
        //nên DanhBa.hinh có kiểu int
        //nếu các bạn muốn lấy ảnh từ internet, thì đặt kiểu String là link hình ảnh
        listDanhBa.add(new DanhBa(R.drawable.ic_account_circle_black_24dp,"Trần Thị Tí","01232323232"));
        listDanhBa.add(new DanhBa(R.drawable.ic_android_black_24dp,"Quang Văn Tèo","0909090909"));
        listDanhBa.add(new DanhBa(R.drawable.ic_build_black_24dp,"Phan Thị Tủn","0123123123"));
        listDanhBa.add(new DanhBa(R.drawable.ic_build_black_24dp,"Phan Văn Tài","01258258258"));

        //Khởi tạo adapter
        adapter = new DanhBaAdapter(MainActivity.this,R.layout.item,listDanhBa);
        //Gán adapter cho listview
        lvDanhBa.setAdapter(adapter);

    }
}
