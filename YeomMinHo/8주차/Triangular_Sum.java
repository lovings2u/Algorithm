import java.util.Scanner;

public class Triangular_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int result=0;
		
		num = sc.nextInt();
		
		for (int i=1 ; i<=num ; i++) {
			result += i*(i+1)*(i+2)/2;
		}
		
		System.out.println(result);
	}
}
