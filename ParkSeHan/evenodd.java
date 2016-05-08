package com.ghkwp;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String d1, d2, d3, d4;
        if(a%2 == 0){
            d1 = "even";
        }else{
            d1 = "odd"; 
        }
        if(b%2 == 0){
            d2 = "even";
        }else{
            d2 = "odd";
        }
        if((a+b)%2 == 0){
            d3 = "even";
        }else{
            d3 = "odd";
        }
        if((a*b)%2 == 0){
            d4 = "even";
        }else{
            d4 = "odd";
        }
        System.out.println(d1 + "+" + d2 + "=" + d3);
        System.out.print(d1 + "*" + d2 + "=" + d4);
	}
}
