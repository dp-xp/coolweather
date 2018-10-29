package com.example.alisa.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Tempertature tempertature;

    @SerializedName("cond")
    public More more;

    public class Tempertature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
