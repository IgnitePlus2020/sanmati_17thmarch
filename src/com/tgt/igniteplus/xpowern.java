package com.tgt.igniteplus;

import java.util.Scanner;

public class xpowern {
    public static void main(String[] args) {
        System.out.println("Enter a number X");
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        System.out.println("Enter a exponent n");
        int n=in.nextInt();
        int res=1;
        System.out.println("The answer for X to the power n is: ");
        if(n==0)
        {
            System.out.print("1");
        }
        else
        {
            for(int i=1;i<=n;i++)
                res=res*x;
            System.out.print(res);
        }

    }
}
