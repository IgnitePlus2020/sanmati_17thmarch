package com.tgt.igniteplus;

import java.util.Scanner;

public class numtowords
{
    public static void main(String[] args) {
        int num[]= new int[20];
        int n;
        System.out.println("Enter the length of the number");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        System.out.println("Enter the number");
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        System.out.print("The number is ");
        for(int i=0;i<n;i++)
            System.out.print(num[i]);
        System.out.println("\nThe number in words is");
        for(int i=0;i<n;i++)
        {
            switch(num[i]){
                case 1:System.out.print("One \t");
                    break;
                case 2:System.out.print("Two \t");
                    break;
                case 3:System.out.print("Three \t");
                    break;
                case 4:System.out.print("Four\t");
                    break;
                case 5:System.out.print("Five \t");
                    break;
                case 6:System.out.print("Six\t");
                    break;
                case 7:System.out.print("Seven \t");
                    break;
                case 8:System.out.print("Eight \t");
                    break;
                case 9:System.out.print("Nine \t");
                    break;
                case 0:System.out.print("Zero \t");
                    break;
                default:
            }

        }
    }
}