package study5;

import java.util.Scanner;

public class grade_sc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score [] = new int[101]; 
		int finish=1000; int i=0;
		int grade[] = new int[5]; //���ʴ�� A,B,C,D,F
		
		while(finish!=-1){
			score[i]=sc.nextInt(); //�Է°� ���ÿ� �迭 �ʱ�ȭ
			finish = score[i];//-1�� �Է����� ������ ���߱�����
			i++; //�ε��� ����
		}
		for(int j=0;j<i-1;j++){
			//i-1������ ������ while���� ������ �Է¿��� i�� �����ؼ�
			switch(score[j]/10){
				case 10:
				case 9: grade[0]++; break; //A
				case 8: grade[1]++; break; //B
				case 7: grade[2]++; break; //C
				case 6: grade[3]++; break; //D
				default : grade[4]++; //F
			}
		}
		
		System.out.println(i-1); //�Էµ� ������ ��
		for(int j=0;j<grade.length;j++) //�� ���� �ο� ��
			System.out.println(grade[j]);
	}

}
