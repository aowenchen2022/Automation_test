package com.noosh.selenium.common;

import java.util.Random;
public class commonModel {

    public int randomInt() {
        Random r = new Random();
        int num = r.nextInt(100000) + 1;
        System.out.println(num);
        return num;

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
