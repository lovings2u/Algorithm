package com.hybrid.exam;

import java.util.Scanner;

public class ex6174 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int count = 0;
        int k = deascend(s)-ascend(s);
        while(true){
            if(k == 6174){
                if(s == 6174){
                    System.out.println(0);
                }else{
                    System.out.println(count + 1);
                }
                break;
            }else{
                k = deascend(k)-ascend(k);
                count++;
            }
        }
    }
    public static int ascend(int a){
        int s = a;
        int s1 = (s/1000);
        int s2 = ((s%1000)/100);
        int s3 = (s%100)/10;
        int s4 = (s%10);
        int arr[] = new int[]{s1, s2, s3, s4};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        int as = (arr[0]*1000) + (arr[1]*100) + (arr[2]*10)+ arr[3];
        return as;
    }
    public static int deascend(int a){
        int s = a;
        int s1 = (s/1000);
        int s2 = ((s%1000)/100);
        int s3 = (s%100)/10;
        int s4 = (s%10);
        int arr[] = new int[]{s1, s2, s3, s4};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        int as = (arr[0]*1000) + (arr[1]*100) + (arr[2]*10)+ arr[3];
        return as;
    }
}