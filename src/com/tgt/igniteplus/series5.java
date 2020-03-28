package com.tgt.igniteplus;

import java.util.Scanner;

import static java.lang.Math.pow;

public class series5 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("The series is ");
        for(int i=1;i<=n;i++){
            if(i==4) continue;
            System.out.println(pow(i,2));}
    }
}
