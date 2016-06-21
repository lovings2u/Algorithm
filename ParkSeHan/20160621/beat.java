import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        double a = (x+y)/2; double b = (x-y)/2;
        if(a==0 && b==0){
            System.out.println((int)a + " " + (int)b);
        }else if(a%1==0 && b%1==0 && a>0 && b>0){
            System.out.println((int)a + " " + (int)b);
        }else{
            System.out.println("impossible");
        }
    }
}