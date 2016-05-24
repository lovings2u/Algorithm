package chch;

import java.util.Scanner;

public class reduction {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c = sc.nextInt(), d = sc.nextInt();
        int x = 0, y = 0; 
        int z = 0, w = 0;
        if(a>b){
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }
        if(c>d){
            z = c;
            w = d;
        } else {
            z = d;
            w = c;
        }
        double dx = (double) z/x;
        double dy = (double) w/y;     
        if(x<z && y<w){
            System.out.println("100%");
        }else if(dx > dy){
            System.out.println((int)(dy*100) +"%");
        }else{
            System.out.println((int)(dx*100) +"%");
        }
    }
}