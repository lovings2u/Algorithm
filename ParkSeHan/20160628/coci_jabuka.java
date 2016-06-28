import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a<=b){
            for (int i = 1; i <= a; i++) {
                if(a%i == 0 && b%i == 0){
                    System.out.print(i + " ");
                    System.out.print(a/i + " ");
                    System.out.println(b/i);
                }
            }
        }else{
            for (int i = a; i >= 1; i--) {
                if(a%i == 0 && b%i == 0){
                    System.out.print(i + " ");
                    System.out.print(a/i + " ");
                    System.out.println(b/i);
                }
            }
        }
    }
}