package com.example.LibraryManagementApp.util;

import java.util.Calendar;
import java.util.Date;

public class Util {
    public static Date getEndDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 1);
        return cal.getTime();
    }
}
