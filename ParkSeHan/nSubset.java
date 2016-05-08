package com.ghkwp;

import java.util.Scanner;


public class nSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();       
        System.out.println((long)Math.pow(b, a));
    }
}