package study6;

import java.util.Scanner;

public class ctu_stock { //������ �ֽ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt(); //�ֽİŷ��� �̷������ ��
		int M= sc.nextInt(); //�ʱ� �ں���
		int [] p = new int[D]; //�� ��¥�� ���� ����
		int min=80000; //p<=40000�̹Ƿ� �� ������ ū������ �ϴ� �ʱ�ȭ
		int max=0; int profit=0;
		
		//�ش� ��¥�� ���� ������ �Է¹޴°Ͱ� ���ÿ� ��� 
		for(int i=0;i<p.length;i++){ 
			p[i]=sc.nextInt(); //�ش� ��¥�� ���� �Է¹���
			min=Math.min(min, p[i]); //�׶� �� ������ min�� ���� ������ �� ���� min�� �Ҵ�
			profit=(p[i]*(M/min))-(min*(M/min)); 
			//(M/min) -> ������ min�� �ش��ϴ� �������� �ֽ��� �� ���̰�, �׶� �ֽ� ���� �ľ�
			// p[i]*(M/min) -> �װ��� ���� �ֽİ����� ���ϸ�, ���� ��¥�� �ֽ��� �ȶ� �޴� ���� ����
			// min*(M/min) -> min�� �ش��ϴ� ��¥�� �������� ���� �״ϱ�  �� ���� ���ָ� ���� ���� ����
			
			max=Math.max(max, profit); //�̶� ���� �ֽİ����� �ȶ��� profit�� max�� ����ִ� ������ ���ؼ� ū���� max�� ����
		}
		System.out.println(max); //���������� max�� ���		
	}

}
