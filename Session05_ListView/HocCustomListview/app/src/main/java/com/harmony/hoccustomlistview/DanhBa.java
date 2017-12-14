package com.harmony.hoccustomlistview;

import java.io.Serializable;

/**
 * Created by Harmony on 12/2/2017.
 */

public class DanhBa implements Serializable {
    private int hinh;
    private String name;
    private String sdt;

    public DanhBa() {
    }

    public DanhBa(int hinh, String name, String sdt) {
        this.hinh = hinh;
        this.name = name;
        this.sdt = sdt;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
