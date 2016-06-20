import java.util.Scanner;
  
public class Beat {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, d;
        int a, b;
          
        s = sc.nextInt();
        d = sc.nextInt();
          
        a = (s+d)/2;
        b = (s-d)/2;
          
        if ( a<0 || b<0 || (s-d)%2==1) {
            System.out.println("impossible");
        } else {
            if (a>b) {
                System.out.println(a + " " + b);
            } else {
                System.out.println(b + " " + a);
            }
        }
    }
}