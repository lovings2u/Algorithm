import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int sub = sc.nextInt();
      
        //a+b = sum
        // a-b = abs(sub)
        //b = sum-a
        //a-sum-a=abs(sub)
         
        int a = -(sum + Math.abs(sub))/-2;
        int b = sum - a;
        if(a<0 || b<0 || a+b!=sum ||Math.abs(a-b) !=sub){
            System.out.println("impossible");
        }
        else{
            System.out.println(a+" "+b);
        }
    }
}
