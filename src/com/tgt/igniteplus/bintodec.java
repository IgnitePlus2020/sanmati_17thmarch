package com.tgt.igniteplus;

import java.util.Scanner;
import static java.lang.Math.pow;

public class bintodec {
    public static void main(String[] args) {
        int decimal = 0;
        int p = 0;
        System.out.println("Enter a binary number");
        Scanner in = new Scanner(System.in);
        int bin= in.nextInt();
        while(true){
            if(bin== 0){
                break; }
            else {
                int temp = bin%10;
                decimal += temp*pow(2, p);
                bin = bin/10;
                p++;
            }
        }
        System.out.println("The decimal equivalent is " + decimal);
    }
}
