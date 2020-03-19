package com.tgt.igniteplus;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        if (str.equals(rev))
            System.out.println("String is a palindrome");
        else
            System.out.println("String is not a palindrome");

    }
}
