package com.example.trunghieutran.hellojava;

/**
 * Created by TrungHieuTran on 11/11/2017.
 */

public class SinhVien {
    String Ten;
    int Tuoi;

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }
    public  String XuatThongTin(){
        return  "Ten:" + Ten + " | Tuoi: " + Tuoi;
    }
}
