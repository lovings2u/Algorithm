import java.util.Scanner;

public class Profit {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		double profit;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		profit = a*(1+b/100)*(1-c/100) - a;
		
		if(profit>=0) {
			System.out.println(Math.round(profit));
		} else {
			System.out.println("loss");
		}
	}
}
