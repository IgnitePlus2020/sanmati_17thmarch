package com.tgt.igniteplus;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        int flag=0,i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=in.nextInt();
        System.out.println("Enter an array of numbers");
        int a[]= new int[20];
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.println("Enter a number in the array to be searched");
        int ele=in.nextInt();
        for(i=0;i<n;i++)
        {
            if (a[i] == ele)
            {
                flag = 1;
                break;
            }
            else
                flag = 0;
        }
        if(flag==1)
            System.out.println("The number is found  " + (i+1));
        else
            System.out.println("The number is not found");
    }
}
