import java.util.Scanner;

public class FixedPoint {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		double n,a;
		
		num = sc.nextDouble();
		
		n = Math.floor(num);
		a = Math.round((num-n)*100);
		System.out.printf((int)n + " " + "%.2f", a/100); 	
	}
}
