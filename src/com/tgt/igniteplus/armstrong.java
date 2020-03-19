package com.tgt.igniteplus;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a three digit number");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int r=0,c=0,temp;
        temp=n;
        while(n!=0)
        {
            r=r%10;
            c+=r*r*r;
            n=n/10;
        }
        if(temp==c)
            System.out.println(temp + " is an ArmStrong number");
        else
            System.out.println(temp + " is not an Armstrong number");

    }
}
