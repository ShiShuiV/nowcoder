package com.example.demo.Test;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

public class TestDemo {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL).format(date));
        System.out.println(UUID.randomUUID());
    }
}
