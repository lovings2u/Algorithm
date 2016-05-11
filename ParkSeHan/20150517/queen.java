package exam20160510;

import java.util.Scanner;
public class queen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        if(a>b){
            System.out.print(b);
        }else {
            System.out.print(a);
        }
    }
}