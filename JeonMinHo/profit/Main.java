package profit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         
        double price = a + a*(b/100.0);
        double sale = price - price*(c/100.0);
        double profit = sale - a;
         
        if(profit < 0) {
            System.out.println("loss");
            return;
        }
        System.out.println(Math.round(profit));
    }
}