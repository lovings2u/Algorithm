// �ð��ʰ�
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
			count[check(arr1[i], arr2[i])] += 1;	// �迭 count[0~num-1]�� �ش��ϴ� �迭 ��ġ�� 1�� �߰�.
		}
		
		for(int i=0 ; i<num ; i++) {
			result += count[i]*(count[i]-1)/2;	// �ش��ϴ� �迭 ��ġ������ �ð����⵵(n(n-1)/2) ��� �����ؼ� result�� ������.
		}
		
		System.out.println(result);
	}
	
	public static int check(int arr1, int arr2) {
		int n;
		if (arr1%2==0 && arr2%2==0) {	// ��ǥ�� (¦��, ¦��)�� ���
			n=0;
		} else if (arr1%2==0 && arr2%2==1) {	// ��ǥ�� (¦��, Ȧ��)�� ���
			n=1;
		} else if (arr1%2==1 && arr2%2==0) {	// ��ǥ�� (Ȧ��, ¦��)�� ���
			n=2;
		} else {	//��ǥ�� (Ȧ��, Ȧ��)�� ���
			n=3;
		}

		return n;
	}
}
