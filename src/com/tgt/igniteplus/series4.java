package com.tgt.igniteplus;

import java.util.Scanner;

public class series4 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a[]=new int[100];
        a[0]=1;a[1]=4;a[2]=7;
        for(int i=3;i<=n;i++)
            a[i]=a[i-1]+a[i-2]+a[i-3];
        System.out.print("The series is \t");
        for(int i=0;i<=n;i++)
            System.out.print(a[i] + "\t");
    }
}
