package com.example.a13pager;

public class MyModel {
    String mv_city;
    int mv_color;
    int mv_condImageResId;
    String mv_description;

    public MyModel(String city, int condImageResId, int color, String description) {
        mv_city = city;
        mv_condImageResId = condImageResId;
        mv_color = color;
        mv_condImageResId = condImageResId;
        mv_description = description;
    }

    public String mf_getCity() {
        return mv_city;
    }

    public int mf_getColor() {
        return mv_color;
    }

    public String  mf_getDescription() {
        return mv_description;
    }
    public int getCondImageResId() {
        return mv_condImageResId;
    }
}
