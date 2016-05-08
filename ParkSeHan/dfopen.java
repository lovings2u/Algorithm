package com.ghkwp;

import java.util.Scanner;
public class dfopen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        if(a>0){
            System.out.print((int)a/1 + " " + String.format("%.2f", a%1));
        }else {
            System.out.print((int)a/1 - 1 +" " + String.format("%.2f", 1+a%1));
        }
    }
}