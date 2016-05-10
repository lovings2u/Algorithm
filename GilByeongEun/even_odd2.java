import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int fi = sc.nextInt();
        int si = sc.nextInt();
        String fib = fi%2==0 ?  "even" : "odd";
        String sib = si%2==0 ?  "even" : "odd";
        String rib = (fi+si)%2==0 ? "even" : "odd";
        String rib2 = (fi*si)%2==0 ? "even" : "odd";
        System.out.println(fib+"+"+sib+"="+rib);
        System.out.println(fib+"*"+sib+"="+rib2);
        sc.close();
    }
}
