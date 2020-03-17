package com.tgt.igniteplus;

import java.util.Scanner;

import static java.lang.Math.pow;

public class series1 {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=1;i<=n;i++)
            System.out.println(pow((2*i),2));
    }
}
