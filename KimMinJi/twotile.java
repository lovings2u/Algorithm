import java.util.Scanner;

public class twotile {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		long res=1;
		
		
		//��� ���ϴ� ��ȭ��
		 for(int i=1;i<=n;i++){
			res=2*res-1;//��������� �״�ο� ���� 1*2Ÿ���ϳ�, 
						//�Ʒ��� 1*2Ÿ�� �� ����ذ��ؼ� ���� ����� *2
						//1*2�� n�� �򸮴°� �ߺ��̱⶧���� -1
			if(0==i%2){	//¦���� ��쿡�� 2*2�� �򸮴°Ͱ� 1*2Ÿ����
						//���ηθ� �򸮴� ����2������ ���־ +2
				res+=2;
			}
		}
		
		
		System.out.println(res%20100529);//��������� �ٵ�20��..����������
	}	

}
