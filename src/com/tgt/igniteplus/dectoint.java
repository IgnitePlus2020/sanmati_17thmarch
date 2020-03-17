package com.tgt.igniteplus;

import java.util.Scanner;

public class dectoint {
    public static void main(String[] args) {
        double a;
        int w;
        double f;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        a = in.nextDouble();
        w=(int)a;
        System.out.println("Integer number = " + w);
        f=(a*10-w*10)/10;
        System.out.println("Fraction part is = " + f);

    }
}
