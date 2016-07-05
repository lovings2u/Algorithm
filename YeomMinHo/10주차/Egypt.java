package egypt;
import java.util.Scanner;

public class Egypt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int gcd = 0;
		int temp = 0;
		int num = 2;
		
		n = sc.nextInt();	// ���ڰ� �Է�
		m = sc.nextInt();	// �и� �Է�
		
		while (n != 1) {		// ���ڰ��� 1�� �Ǹ� �ݺ��� ������ ����
			gcd = gcdCal(n,m);	// n�� m�� �ִ�����
			n = n/gcd;
			m = m/gcd;
			temp = lcmCal(m,num);	// m�� num�� �ּҰ���� = �и�
			
			if ((n * (temp/m)) - (temp/num) > 0) {	//n * (temp/m)) - (temp/num) => �� ���� �м� ����� �� ������ �ɰ��� 
				n = (n * (temp/m)) - (temp/num);	//n�� 0���� Ŭ ��쿡 ������ ��� �� �־���
				m = temp;							//temp�� m�� num�� �ּҰ���� = �и� = m
			
				System.out.print("1/" + num + " ");	//�ش��ϴ� �����м� ���
				
			}

			if (n==1) {
				System.out.print("1/" + m);	// n�� 1�� �� ��� ���������� �� �ϳ� �� ���
			}
			
			num++;
		}
	}
	
	public static int gcdCal(int x, int y) {	// �ִ�����(gcd) ���ϴ� �޼ҵ�
		int i, min;
		min = Math.min(x, y);
		
		for (i=min ; i>0 ; i--) {	// �ִ������� ���ϴ� for��
			if(x%i==0 && y%i==0) {
				break;
			}
		}
		
		return i;	// �ִ����� �� return
	}
	
	public static int lcmCal(int x, int y) {	// �ּҰ����(lcm) ���ϴ� �޼ҵ�
		int gcd = gcdCal(x,y);
		
		return gcd * (x/gcd) * (y/gcd);
	}
}
