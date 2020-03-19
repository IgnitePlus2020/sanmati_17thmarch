package com.tgt.igniteplus;
import java.util.Scanner;

public class factofnum {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=in.nextInt();
    int f= fact(n);
    System.out.println("The factorial of " + n + "is " + f);
    }
       
    static int fact(int n){
        if(n==0)
            return 1;
        else {
            int i = n * fact(n - 1);
            return i;
        }
    }
}
