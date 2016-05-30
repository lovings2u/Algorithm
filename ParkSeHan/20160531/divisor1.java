import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong(), b=sc.nextLong();
        long sum=0;
        int start = (int)Math.ceil(Math.sqrt(a));
        int desti = (int)Math.floor(Math.sqrt(b));
        System.out.print(desti-start+1 + " ");
        for (long i = start; i <= desti; i++) {
            sum += i*i;
            sum %=1000000003;
        }
            System.out.println(sum);
    }
}