package study5;

import java.util.Scanner;

public class divisor22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long  A = sc.nextLong(); long B = sc.nextLong();
		long sum=0; int num=0;
		
		for(long i=A;i<=B;i++){
			if(((long)Math.sqrt(i))*((long)Math.sqrt(i))==i){
				//������ ���ϱ� ������ �Ѱ� �ڱ��ڽ��̸� ������
				sum+=i; num++;
			}
		}
		System.out.println(num+" "+(sum%1000000003));
		
	}
}
