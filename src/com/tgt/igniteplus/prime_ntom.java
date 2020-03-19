package com.tgt.igniteplus;

import java.util.Scanner;

public class prime_ntom {
    public static void main(String[] args) {
        System.out.println("Enter two numbers ");
        Scanner in= new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
       for(int j=2;j<=m;j++)
        {
            for(int i=n;i<=m;i++)
            {
                if(i%(j/2)!=0)
                {
                    System.out.println(i);
                }
            }

        }
    }
}
