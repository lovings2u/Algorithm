import java.util.Scanner;

public class Tea {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		double result=0;
		
		num = sc.nextDouble();
		
		if (num%2 == 0) {
			result = num/2 * (num/2-1);
		} else {
			result = Math.floor(num/2) * (Math.floor(num/2)-1) / 2 + Math.ceil(num/2) * (Math.ceil(num/2)-1) / 2;
		}
		
		System.out.println((int)result);
	}
}
