package com.ghkwp;

import java.util.Scanner;
public class tilesopen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0;
        if(a%8==0 && b%8==0){       
            c = 0;
        }else if((a%8==0&&b%8!=0) || (a%8!=0&&b%8==0)){
            if(a%8<b%8){
                c = a/8;
            }else{
                c = b/8;
            }
        }else if(a%8!=0 && b%8!=0){
            c = (int)((a/8)+(b/8)+1);
        }
        System.out.println("The number of whole tiles is "+(int)((a/8)*(b/8)) + " part tiles is " + c);
    }
}