package study6;

import java.util.Scanner;

public class coci_tablica {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		
		// a-b-c-d �� 0��
		// c-a-d-b �� 1��
		// d-c-b-a �� 2��
		// b-d-a-c �� 3��
		
		double result[] = new double[4];
		int rotate=0;
		
		result[0]= ((double)A/C)+((double)B/D);
		result[1]= ((double)C/D)+((double)A/B);
		result[2]= ((double)D/B)+((double)C/A);
		result[3]= ((double)B/A)+((double)D/C);
		
		double temp=result[0]; //�ϴ� ȸ������������ �ʱ�ȭ
		for(int i=0; i<result.length; i++)
			temp=Math.max(temp, result[i]); //temp�� �ִ밪 ����
		
		if(temp==result[0]) rotate=0;
		else if(temp==result[1]) rotate=1;
		else if(temp==result[2]) rotate=2;
		else rotate=3;
		
		System.out.println(rotate);
		
		
	}
}
