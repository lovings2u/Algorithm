package exam20160510;

import java.util.ArrayList;
import java.util.Scanner;
 
public class oddddoOpen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c= 0, d=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= a; i++) {
            c = (i-1)*2 + 1;
            list.add(c);
        }   
        for (int i = 0; i < a; i++) {
            d = d + list.get(i) * list.get(a-i-1);
        }
        System.out.println(d);
    }
}