import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int l = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        double temp = a/(double)l;
        double temp2 = b/(double)j;
        double temp3 = c/(double)k;
        double min = temp;
        if(min>temp2)
            min = temp2;
        if(min>temp3)
            min = temp3;
        double result1 = (double)a - min*l;
        double result2 = (double)b - min*j;
        double result3 = (double)c - min*k;
        System.out.printf("%.6f %.6f %.6f", result1, result2, result3);
    }
 
       
}
