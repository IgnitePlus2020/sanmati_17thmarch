package com.tgt.igniteplus;

import java.util.Scanner;

public class dectobin {
    public static void main(String[] args) {
        int[] bin = new int[1000];
        int i = 0;
        System.out.println("Enter a decimal number");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        while (n > 0)
        {
            bin[i] = n % 2;
            n = n / 2;
            i++;
        }
        System.out.println("The binary equivalent is ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(bin[j]);
    }
}

