package com.ghkwp;

import java.util.Scanner;
public class calorie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        switch(sc.nextInt()){
        case 1 : sum += 461;
            break;
        case 2 : sum += 431;
            break;
        case 3 : sum += 420;
            break;
        case 4 : break;
        }
        switch(sc.nextInt()){
        case 1 : sum += 130;
            break;
        case 2 : sum += 160;
            break;
        case 3 : sum += 118;
            break;
        case 4 : break;
        }
        switch(sc.nextInt()){
        case 1 : sum += 100;
            break;
        case 2 : sum += 57;
            break;
        case 3 : sum += 70;
            break;
        case 4 : break;
        }
        switch(sc.nextInt()){
        case 1 : sum += 167;
            break;
        case 2 : sum += 266;
            break;
        case 3 : sum += 75;
            break;
        case 4 : break;
        }
        System.out.println("Your total Calorie count is " + sum +".");
    }
}
	