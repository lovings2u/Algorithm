import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int fi = sc.nextInt();
        int si = sc.nextInt();
        int rfi = fi%8;
        int rsi = si%8;
        fi = (fi/8);
        si = (si/8);
        rfi = rfi!=0 ? fi+1 : fi;
        rsi = rsi!=0 ? si+1 : si;
        int result = (rfi)*(rsi);
        result = result - (fi*si);
        System.out.println("The number of whole tiles is "+ (fi*si)+" part tiles is "+result);
        sc.close();
    }
}
