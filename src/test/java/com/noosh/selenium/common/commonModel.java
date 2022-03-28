package com.noosh.selenium.common;

import sun.util.calendar.AbstractCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
public class commonModel {

    public int randomInt() {
        Random r = new Random();
        int num = r.nextInt(100000) + 1;
        System.out.println(num);
        return num;
    }

    /**
     * 输入日期
     * */
    public String oneDaysAfter(){
        String oneDaysAfter = "";
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_YEAR, +1);
        Date after = cal.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("mm.DD.yyyy");
        oneDaysAfter = formatter.format(after);
        return oneDaysAfter;
    }


    public void sleep(int n) {
        try {
            String s = Integer.toString(n);
            String s1 = s+"000";

            Integer it = new Integer(s1);
            Thread.sleep(it);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
