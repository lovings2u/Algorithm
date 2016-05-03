package candy;

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {

        System.out.println(getResult());
    }

    
    static int getResult() {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         
    	b = (int)Math.pow(10, b);
    	return (int) Math.round((a/(double)b))*b;
    }
}