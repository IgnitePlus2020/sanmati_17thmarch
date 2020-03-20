package com.tgt.igniteplus;

import java.util.Scanner;

public class numtowords {
    public static void main(String[] args) {
        int n,length;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        n=in.nextInt();
        System.out.println("The number in words is");
        int r=0,temp=n,dig;
        while(n!=0)
        {
            r=temp%10;
            r=r*10;
            temp=temp/10;
        }
        r=r/10;
        temp = r;
        while (temp != 0)
        {
            dig = temp % 10;
            switch(dig)
            {
                case 1:System.out.println("One \t");
                       break;
                case 2:System.out.println("Two\t");
                    break;
                case 3:System.out.println("Three \t");
                    break;
                case 4:System.out.println("Four\t");
                    break;
                case 5:System.out.println("Five \t");
                    break;
                case 6:System.out.println("Six\t");
                    break;
                case 7:System.out.println("Seven \t");
                    break;
                case 8:System.out.println("Eight \t");
                    break;
                case 9:System.out.println("Nine \t");
                    break;
                case 0:System.out.println("Zero \t");
                    break;
                default:
            }
        }

    }
}
