import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
         
        for (int i = a; i >= 2; i--) {
            if(a%i == 0 && b%i==0){
                a/=i;
                b/=i;
                break;
            }
        }
        while(a != 1){
            int temp = (int)Math.ceil((double)b/a);
            System.out.println("1/"+temp+" ");
            a *= temp;
            a -= b;
            b *= temp;
            for (int i = a; i >= 2; i--) {
                if(a%i==0 && b%i ==0){
                    a/=i;
                    b/=i;
                    break;
                }
            }
        }
        System.out.println("1/"+b);
    }
}