package com.tgt.igniteplus;

import java.util.Scanner;

import static java.lang.Math.pow;

public class series6 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("The series is");
        int sum = 1;
        for (int i = 2; i <= n+1; i++) {
            System.out.print(sum + "\t");
            sum = sum + (int)(pow(2,i));
        }
    }
}