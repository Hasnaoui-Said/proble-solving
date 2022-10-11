package com.hackerrank;

import java.text.SimpleDateFormat;
import java.util.*;

public class FindDay {
    public static void main(String[] args) {
        System.out.println(findDay(02, 29, 2004));
    }
    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.YEAR,year);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.US).toUpperCase();
    }

}

