package study6;

import java.util.Scanner;

public class loglog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //�볪�� ����
		int bottom, temp, top;
		int allnum=0; //��������� �볪�� ���� üũ ����
		boolean b=true;
		int fbottom=0; int ftop=0;
		bottom=1;	 //���ϴ��� 1���� ���� ���� �ش�.
		
		while(b){

			temp=bottom; //�ֻ���� ���ϴ��� �������� ���ҽ����ش�.
			while(temp>0){ //�ֻ���� ������ 0���� Ŭ�������� �ݺ��Ѵ�. 
			
				allnum += temp; //������� �볪���� ������ check�Ѵ�.
				if(allnum==N){//���� �Է¹��� �볪�������� ��������
					fbottom=bottom;
					ftop=temp;
					temp=-100;
					b=false;					
				}
				else if(allnum>N){//�볪�� �������� Ŀ����
					fbottom=bottom;
					ftop=N-(allnum-temp);
					temp=-100;
					b=false;
				}
				else temp--;
			}			
			
			bottom++;
		}
		System.out.println(fbottom+" "+ftop);
	}
}

