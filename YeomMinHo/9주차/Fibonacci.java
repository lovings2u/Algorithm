import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[40];
		int i=0;
		int[] width = new int[40];
		int[] height = new int[40];
		
		while (true) {
			num[i] = sc.nextInt();
			
			if(num[i] < 2) {
				break;
			}
			
			i++;
		}
		
		for (int j=0 ; j<i ; j++) {
			if (num[j] % 2 == 0) {
				width[j] = fibonacci(num[j]+1);
				height[j] = fibonacci(num[j]);
			} else {
				width[j] = fibonacci(num[j]);
				height[j] = fibonacci(num[j]+1);
			}	
		}
		
		for (int j=0 ; j<i ; j++) {
			System.out.println("Case #" + (j+1) + ":");
			System.out.println(width[j] + ", " + height[j]);	
			System.out.println("");
		}
	}
	
	public static int fibonacci(int num) {
		if (num == 1 || num == 2) {
			return 1;
		}
		
		return fibonacci(num-1)+fibonacci(num-2);
	}
}
