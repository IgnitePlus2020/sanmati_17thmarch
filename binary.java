package com.tgt.igniteplus;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=in.nextInt();
        System.out.println("Enter the numbers in sorted order");
        int a[]= new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.println("Enter the element to be searched");
        int ele= in.nextInt();
        int low=0,high=n+1,mid=(low+high)/2;
        while(low<high)
        {
            if(ele==a[mid]){
                System.out.println("Number found at position " + (mid+1));
                break;}
            else if(ele<a[mid])
                mid=mid-1;
            else
                mid=mid+1;
        }
    }
}
