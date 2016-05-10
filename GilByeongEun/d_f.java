import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        float input;
        int n=0;
        float a=0;
        input = sc.nextFloat();
        n = (int) input;
        if(n<0){
            n = n-1;
            a = input -n;
        }
        else if(n>0){
            a = (input- n);
        }
        System.out.println(n+" "+String.format("%.2f", a));
        sc.close();
    }
}
