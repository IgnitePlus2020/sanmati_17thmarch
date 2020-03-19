package com.tgt.igniteplus;

import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        int n,r=0;
        System.out.println("Enter a number to reverse");
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
        System.out.println("The reverse of the number is");
        while(n!=0)
        {
            r=n%10;
            System.out.print(r);
            n=n/10;
        }
    }
}
