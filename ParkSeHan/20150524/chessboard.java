package chch;

import java.util.Scanner;

public class chessboard {
    public static void main(String[] args) {
        int t, x, y, d;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double k=(1.0 + Math.sqrt(4.0*(double)a-3.0))/2.0;
        d = (int) k;
        x = d;
        y = d;
        t=d*d-d+1;
        if(d%2 == 1){
            if(t<=a && a<=t+d-1){
                x -=(a-t);
            }else{
                y += 1;
                x = 1;
                x+=a-t-d;
            }
        }else{
            if(t<=a && a<t+d){
                y -=(a-t);
            }else{
                x+=1;
                y=1;
                y+=a-t-d;
            }
        }
        System.out.println(x + " " + y);
         
    }
}