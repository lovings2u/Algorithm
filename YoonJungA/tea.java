package study0614;

import java.util.Scanner;

public class tea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result=0;
		
		if(n%2!=0){ //Ȧ��
			int oddcheck=(n/2)+1; //��+1�� ���� �� ���� Ȧ�� ����
			for(int i=1,k=1;i<oddcheck;i++,k=k+2)
				result += k;
		}
		else{ //¦��
			int evencheck=n/2; //���� ���� �� ���� ¦�� ����
			for(int i=1,k=2;i<evencheck;i++,k=k+2)
				result += k;
		}
		
		System.out.println(result);
	}
}

// 1�� : 0			2�� : 0
// 3�� : 1			4�� : 2
// 5�� : 4			6�� : 6
// 7�� : 9
