package study4;

import java.util.Scanner;

public class reduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int b1=sc.nextInt(); int s1=sc.nextInt();
		int b2=sc.nextInt(); int s2=sc.nextInt();
		int result=0;
		
		if(b1<s1){ //ū���� ū������
			int temp=b1;
			b1=s1;
			s1=temp;
		}
		if(b2<s2){ //���ϱ� ���ؼ�
			int temp=b2;
			b2=s2;
			s2=temp;
		}
		
		if(b1<=b2&&s1<=s2){//��������� �� ũ�ų� ������
			result=100;
		}else if(b1<=b2){
			result=(s2*100)/s1;			
		}else if(s1<=s2){
			result=(b2*100)/b1;
		}else{
			int temp1 = (b2*100)/b1;
			int temp2 = (s2*100)/s1;
			if(temp1>=temp2){
				result=temp2;
			}else result=temp1;
		}
		System.out.println(result+"%");
	}
}
