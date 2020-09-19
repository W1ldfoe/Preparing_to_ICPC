package com.company;

import java.util.Scanner;

public class Main

{

    public static void main(String[] args)
    {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        int res = n - (n & (n  - 1));
        System.out.println(res);

    }

}