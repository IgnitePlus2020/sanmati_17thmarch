package com.tgt.igniteplus;

import java.util.Scanner;

public class series8 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int fib[]= new int[50];
        fib[0]=0;fib[1]=1;
        for(int i=2;i<=n;i++)
            fib[i]=fib[i-1]+fib[i-2];
        System.out.println("the fibonacci series is ");
        for(int i=0;i<=n;i++)
            System.out.println(fib[i] + "\t");
    }
}
