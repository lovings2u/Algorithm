import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double result = 60*a/11.0; 
        if((int)result<60){
            System.out.printf("%.6f",result);
        }
        else if(result>60){
            result = 0;
            System.out.printf("%.6f",result);
        }
        else{
            System.out.println("CAN'T SEE!");
        }
    }
    
}