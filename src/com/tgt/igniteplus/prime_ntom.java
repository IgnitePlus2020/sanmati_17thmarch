package com.tgt.igniteplus;

import java.util.Scanner;

public class prime_ntom {
    public static void main(String[] args) {
        System.out.println("Enter two numbers ");
        Scanner in= new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
        while (n<m) {
            boolean flag = false;
            for(int i = 2; i <= n/2; ++i) {
                if(n % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(n + "\t");
            ++n;
        }
    }
}