package study0614;

import java.util.Scanner;

public class luckynum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int check = 0; //�ڸ���
		
		int i=1;
		while(true){
			if((int)Math.pow(2,i)>k){
				check=i; break; //check-1�� k�� ��ġ�ϴ� ���� �ڸ���
			}
			i++;
		}
		int num = k-((int)Math.pow(2,check-1));
		//num�� k���� ���� �ڸ����� �������� ���� = ������ ����ؾ��� �κ�
		
		for(int j=1;j<check+1;j++){
			int seven=j-1;
			int four=check-seven;
			
			
		}

		
		 
		
		
		System.out.println(check+" "+num);
	}

}
