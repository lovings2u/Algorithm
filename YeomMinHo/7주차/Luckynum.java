//�ð� �ʰ�....
//
//import java.util.Scanner;
//
//public class Luckynum {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num;
//		int p=0;
//		int count=0;
//		String binary="";
//		int gap=0;
//		
//		num = sc.nextInt();
//		
//		while (count!=num) {
//			for(int i=0 ; i<Math.pow(2, p+1) ; i++) {
//				count++;
//				
//				if (count == num) {	//	�Էµ� num�� �ݺ��ϰ� �ִ� count�� ���� ������ while������ ��������.
//					binary = String.valueOf(i);	//	p��°���� i��°�� ���� binary�� �Է� (p�� �ڸ���, i�� �� �ڸ��������� ��� °����)
//					break;
//				}
//			}
//			
//			p++;
//		}
//
//		//2���� ��ȯ
//		binary = Integer.toBinaryString(Integer.valueOf(binary));
//		
//		gap = p-binary.length();	// binary ��Ʈ���� 0�� � �����ϴ��� gap�� ���
//		if(binary.length() != p) {	//	�ڸ���(p)�� ���� ������ 0�� ���� �� - ���� ��� 011 �� ǥ���� �� 11�� ǥ���ǹǷ� 0�� �տ��� �ٿ���.
//			for(int i=0 ; i< gap ; i++) {
//				binary = "0"+ binary;
//			}
//		}
//		
//		binary = binary.replace('0', '4');	//	0 ���ڸ� 4�� ����
//		binary = binary.replace('1', '7');	//	1 ���ڸ� 7�� ����
//		
//		System.out.println(binary);
//	}
//}

import java.util.Scanner;

public class Luckynum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		int n=1;
		int count=0;
		String binary="";
		int gap=0;
		
		num = sc.nextInt();
		
		while (num > Math.pow(2,n+1)) {
			sum += Math.pow(2,n);
			n++;
		}

		//���ڸ� String ������ ��ȯ
		binary = String.valueOf(num-sum-1);
		//2���� ��ȯ
		binary = Integer.toBinaryString(Integer.valueOf(binary));
		
		gap = n-binary.length();	// binary ��Ʈ���� 0�� � �����ϴ��� gap�� ���
		if(binary.length() != n) {	//	�ڸ���(p)�� ���� ������ 0�� ���� �� - ���� ��� 011 �� ǥ���� �� 11�� ǥ���ǹǷ� 0�� �տ��� �ٿ���.
			for(int i=0 ; i< gap ; i++) {
				binary = "0"+ binary;
			}
		}
		
		binary = binary.replace('0', '4');	//	0 ���ڸ� 4�� ����
		binary = binary.replace('1', '7');	//	1 ���ڸ� 7�� ����
		
		System.out.println(binary);
	}
}