import java.util.Scanner;

public class tpz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int t = sc.nextInt();
		int p = sc.nextInt();
		int g = sc.nextInt();
		
		int max=0; int min=0;
		
		if(t<=p){ //�ּҰ� ã��
			if(t<=g) max=t;
			else max=g;
		}else{
			if(p<=g) max=p;
			else max=g;
		}
		
		if(t+p+g<=N) min=0; //�������� ���� �� �μ����� ������ 0
		else{
			int count1 = N-t; //�׶� ���ϰ� ���� ��
			int count2 = N-p; //�����佺 ���ϰ� ���� ��
			
			if(count1+count2>=g) min=0; //���� ������ ���� g�� �ʿ��� ������ ���Ŵ� ũ�� 0
			else min = g-(count1+count2); //�ƴϸ� g���� ������ ������ �´� �����ϴ� ��
		}
		System.out.println(max+" "+min);
			
	}

}
