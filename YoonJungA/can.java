package study5;

import java.util.Scanner;

public class can {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int black =sc.nextInt();
		int white =sc.nextInt();
		
		//�Ͼ� ���� Ȧ���� ��� �Ͼ� ���� ����, �Ͼ� ���� ¦���� ��� ���� ���� ���´�.
		
		if(white%2==0) System.out.println("black");
		else System.out.println("white");
	}
}
