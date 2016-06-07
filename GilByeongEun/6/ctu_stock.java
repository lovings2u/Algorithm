
import java.util.Scanner;
 
public class Main {
    public static void main (String[] args) {
    	//
        Scanner sc = new Scanner(System.in);
        int day;
        int i, money, total;
        int min = 70000, gain = 0;
        day = sc.nextInt();
        money = sc.nextInt();
        int stock[] = new int[day];
        for (i = 0; i < day; i++){
            stock[i] = sc.nextInt();
            if (stock[i] <= min){
                min = stock[i];
            }
            total = stock[i] * (money / min) + (money % min) - money;
            if (total > gain){
                gain = total;
            }
     
        }
        System.out.println(gain);
    }
}
