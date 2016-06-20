// 시간초과
//
//import java.util.Scanner;
//
//public class Midp {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num;
//		int count=0;
//		
//		num = sc.nextInt();
//		int[] arr1 = new int[num];
//		int[] arr2 = new int[num];
//		
//		for(int i=0 ; i<num ; i++) {
//			arr1[i] = sc.nextInt();
//			arr2[i] = sc.nextInt();
//		}
//		
//		for(int i=1 ; i<num ; i++) {
//			for(int j=i ; j<num ; j++) {
//				if ((arr1[i-1] + arr1[j])%2==0 && (arr2[i-1] + arr2[j])%2==0) {
//					count++;
//				}	
//			}
//		}
//		
//		System.out.println(count);
//	}
//}

import java.util.Scanner;

public class Midp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int result=0;
		
		num = sc.nextInt();
		int[] arr1 = new int[num];
		int[] arr2 = new int[num];
		int[] count = new int[num];
		
		for(int i=0 ; i<num ; i++) {
			arr1[i] = sc.nextInt();
			arr2[i] = sc.nextInt();
			count[check(arr1[i], arr2[i])] += 1;	// 배열 count[0~num-1]에 해당하는 배열 위치에 1씩 추가.
		}
		
		for(int i=0 ; i<num ; i++) {
			result += count[i]*(count[i]-1)/2;	// 해당하는 배열 위치에서의 시간복잡도(n(n-1)/2) 계산 수행해서 result에 더해줌.
		}
		
		System.out.println(result);
	}
	
	public static int check(int arr1, int arr2) {
		int n;
		if (arr1%2==0 && arr2%2==0) {	// 좌표가 (짝수, 짝수)일 경우
			n=0;
		} else if (arr1%2==0 && arr2%2==1) {	// 좌표가 (짝수, 홀수)일 경우
			n=1;
		} else if (arr1%2==1 && arr2%2==0) {	// 좌표가 (홀수, 짝수)일 경우
			n=2;
		} else {	//좌표가 (홀수, 홀수)일 경우
			n=3;
		}

		return n;
	}
}
