package com.jyeh.mongoarray;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static Date parseDate(String dateString) {
        try {
            return SIMPLE_DATE_FORMAT.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException("Invalid date", e);
        }
    }
}
