package com.tgt.igniteplus;

import java.util.Scanner;

public class strrev {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
            rev += str.charAt(i);

        System.out.println("The reversed string is " + rev);
    }
}
