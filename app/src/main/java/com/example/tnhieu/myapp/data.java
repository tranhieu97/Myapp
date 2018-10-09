package com.example.tnhieu.myapp;

import java.io.Serializable;

public class data {
    private static   String name;
    private  static String tuoi;
    private static String diachi;

    public data(String name, String tuoi, String diachi) {
        this.name = name;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }

    public static String  getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }


    public static String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
}
