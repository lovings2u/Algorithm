// 1번방법 - 시간초과
// 
//import java.util.Scanner;
//
//public class Divisor1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long A,B;
//		long sum=0;
//		long count=0;
//		
//		A = sc.nextLong();
//		B = sc.nextLong();
//		
//		for(long i=A ; i<=B ; i++) {
//			if (Divisor(i) != 0) {
//				sum += Divisor(i);
//				sum = sum%1000000003;
//				count++;
//			}
//		}
//		
//		System.out.println(count + " " + sum);
//	}
//	
//	public static long Divisor(long x) {
//		int count=0;
//		
//		for(long i=1 ; i<=x ; i++) {
//			if(x%i==0) {
//				count++;
//			}
//		}
//		
//		if (count%2==1) {
//			return x;
//		} else {
//			return 0;
//		}
//
//	}
//}



// 2번방법 - 시간초과
//import java.util.Scanner;
//
//public class Divisor1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long A,B;
//		long sum=0;
//		long divide_count=0;
//		int count=0;
//		
//		A = sc.nextLong();
//		B = sc.nextLong();
//		
//		for(long i=A ; i<=B ; i++) {
//			divide_count = 0;
//			for (long j=1 ; j<=i ; j++) {
//				if (i%j == 0) {
//					divide_count++;
//				}
//			}
//			if (divide_count%2==1) {
//				sum += i;
//				sum = sum%1000000003;				
//				count++;
//			}
//		}
//		
//		System.out.println(count + " " + sum);
//	}
//}


// 3번째 방법 - 시간초과
//
//import java.util.Scanner;
//
//public class Divisor1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long A,B;
//		int count=0;
//		long sum=0;
//		
//		A = sc.nextLong();
//		B = sc.nextLong();
//
//		long i = A;
//		while (i<=B) {
//			if(i % Math.sqrt(i) == 0) {
//				count++;
//				sum += i;
//				sum = sum%1000000003;	
//			}
//		}
//		
//		System.out.println(count + " " + sum);
//	}
//}


import java.util.Scanner;

public class Divisor1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A,B;
		int count=0;
		long pow=0;
		long sum=0;
		
		A = sc.nextLong();
		B = sc.nextLong();
		
		long i = (long)Math.sqrt(A);	// i의 초기값을 제곱근으로 
		
		while(i <= Math.sqrt(B)) {
			pow = (long)Math.pow(i, 2);
			if ( A <= pow && B >= pow) {	// 범위 설정 (A~B 사이)
				count++;	
				sum += pow;
				sum = sum%1000000003;
			}
			
			i++;
		}
		
		System.out.println(count + " " + sum);
	}
}
