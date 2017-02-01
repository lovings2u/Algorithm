//import java.util.Scanner;
//
//public class Q1411 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Q1411 q = new Q1411();
//		int input = 0;
//		int result = 0;
//		
//		input = sc.nextInt();
//		
//		System.out.println(q.calculate(input));	
//	}
//	
//	int calculate(int n) {
//		int result = 3;
//		
//		if(n == 2) {
//			return result;
//		} else if (n % 2 == 0) {
//			return (calculate(n-1)*2 + 1) % 20100529;
//		} else if (n % 2 == 1) {
//			return (calculate(n-1)*2 - 1) % 20100529;
//		} else {
//			return 0;	
//		}
//	}
//}
//
//재귀 형식으로 할 경우 시간 초과

import java.util.Scanner;

public class Q1411 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int result = 0;
		
		input = sc.nextInt();
		
		for (int i = 2 ; i <= input ; i++) {
			if (i == 2) {
				result = 3;
			} else if (i % 2 == 0) {
				result = (result * 2 + 1) % 20100529;
			} else if (i % 2 == 1) {
				result = (result * 2 - 1) % 20100529;
			}
		}
		
		System.out.println(result);	
	}
}
