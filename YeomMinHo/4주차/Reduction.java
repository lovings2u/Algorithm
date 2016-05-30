import java.util.Scanner;

public class Reduction {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		double result=1;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		result = Math.max(100/ratio(a,b,c,d), 100/ratio(a,b,d,c));
		if(result<=100) {
			System.out.println((int)result + "%");
		} else {
			System.out.println("100%");
		}
	}
	
	public static double ratio(int num1, int num2, int num3, int num4){
		double x = 0;
		
		x = Math.max((double)num1/num3, (double)num2/num4);
		return x;
	}
}
