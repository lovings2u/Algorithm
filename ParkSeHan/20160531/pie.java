import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int numerator = (x1 * y2) + (x2 * y1);
        int denominator = y1 * y2;
        int big = (y1>y2) ? y1 : y2;
        if(big == x1+x2){
            System.out.println(0);
        }else{
            int gcd = 0;
            for (int i = 1; i <= numerator; i++) {
                if((numerator%i == 0) && (denominator%i ==0)){
                    gcd = i;
                }
            }
            System.out.println(((denominator/gcd)-(numerator/gcd))+"/"+denominator/gcd);
        }
    }
}