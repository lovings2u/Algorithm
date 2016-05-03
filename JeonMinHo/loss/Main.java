package loss;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        sc.nextInt();
         
        System.out.println(getResult(input1, input2, input3));
    }
    
    static int getResult(int a, int b, int c) {
    	return -(b - c - a);
    }
}