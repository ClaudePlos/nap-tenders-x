package pl.kskowronski.application.data.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MapperDate {

    public SimpleDateFormat dtYYYYMMDD = new SimpleDateFormat("yyyy-MM-dd");
    public SimpleDateFormat dtYYYYMMDDHHMM = new SimpleDateFormat("yyyy-MM-dd hh:mm");
    public SimpleDateFormat dtYYYY = new SimpleDateFormat("yyyy");
    public SimpleDateFormat dtYYYYMM = new SimpleDateFormat("yyyy-MM");
    public SimpleDateFormat dtDD = new SimpleDateFormat("dd");

    public String getCurrentlyYear(){
        Date today = new Date();
        return dtYYYY.format(today);
    }

}
