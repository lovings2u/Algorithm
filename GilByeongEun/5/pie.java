import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int ja1 = sc.nextInt();
        int mo1 = sc.nextInt();
        int ja2 = sc.nextInt();
        int mo2 = sc.nextInt();
        int mo;
        int ja;
        mo = mo1 * mo2;
        ja = (mo/mo1)*ja1+(mo/mo2)*ja2;
 
        ja = mo - ja;
        if(ja==0 || ja>mo){
            System.out.println("0");
            return;
        }
 
//        int gcd = gcdThing(mo, ja);
        int gcd = GCD(mo, ja);
        mo = mo/gcd;
        ja = ja/gcd;
         
        System.out.println(ja + "/"+mo);
    }
    
    private static int gcdThing(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }
     
    // 함수를 사용하지 호제법 알고리즘으로 직접 구현 
    private static int GCD(int a, int b) {
        if (b == 0){
            return a;
        }
        return GCD(b, a % b);
    }
}
