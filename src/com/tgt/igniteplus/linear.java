package com.tgt.igniteplus;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=in.nextInt();
        System.out.println("Enter an array of numbers");
        int a[]= new int[20];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.println("Enter a number in the array to be searched");
        int ele=in.nextInt();
        for(int i=0;i<n;i++)
            if(a[i]==ele)
                System.out.println("Number found at position " + (i+1));
            else
                break;
    }
}
