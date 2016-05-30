package exam20160510;

import java.util.Scanner;
public class clo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = (60*a)/11;
        if(a==12){
            System.out.println(String.format("%.6f", 0.000000));
        }else if(a==11){
            System.out.println("CAN'T SEE!");
        }else {
            System.out.println(String.format("%.6f", b));
        }
    }
 
}