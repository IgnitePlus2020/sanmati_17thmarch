package com.tgt.igniteplus;

import java.util.Scanner;

public class series7 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int sum=1;
        System.out.println("The series is ");
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.print("-" + sum + "\t");
            }
            else
            {
                System.out.print(sum + "\t");
            }
            sum= sum + (i*i);
        }
    }
}
