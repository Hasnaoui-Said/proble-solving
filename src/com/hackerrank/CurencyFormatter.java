package com.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat us = NumberFormat.getCurrencyInstance(new Locale("en", "US"));

        NumberFormat sk = NumberFormat.getCurrencyInstance(new Locale("sk", "SK"));

        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        NumberFormat cn = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + in.format(payment));
        System.out.println("China: " + cn.format(payment));
        System.out.println("France: " + sk.format(payment));
    }
}
