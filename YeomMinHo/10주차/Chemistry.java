package chemistry;
import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num=0, temp=0;
        int count=0;
         
        while(true) {
            num = sc.nextDouble();
             
            if(num == 999) {
                break;
            }
            if (count != 0) {
                System.out.printf("%.2f", num-temp);
                System.out.println(""); 
            }
             
            temp = num;
            count++;
        }
        System.out.println("End of Output");
    }
}
