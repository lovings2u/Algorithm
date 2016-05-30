import java.util.Scanner;

public class Pie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		int lcm, gcd;
		int resulta;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		gcd = GcdCal(b,d);	// �ּҰ������ ���ϱ� ���� �ִ����� ���
		lcm = gcd * (b/gcd) * (d/gcd);	// �ּҰ���� ���
		
		a = lcm/b * a;	// �Է¹��� �м��� �ּҰ������ �̿��Ͽ� ù��° ���ڰ� ���
		c = lcm/d * c;	// �Է¹��� �м��� �ּҰ������ �̿��Ͽ� �ι�° ���ڰ� ���

		resulta = lcm-(a+c);	// ���� ���̾��� ���� ��
		gcd = GcdCal(resulta, lcm);	// ���м��� ����ϱ� ���� �ִ����� ���
		
		if ( resulta == 0 ) {	// ���� ������ ���� ���� ���
			System.out.println("0");
		} else {	// ���� ������ ���� ���� ���
			System.out.println(resulta/gcd + "/" + lcm/gcd);	
		}
	}
	
	public static int GcdCal(int x, int y) {	// �ִ�����(gcd) ���ϴ� �޼ҵ�
		int i, min;

		min = x<=y ? x:y;	// �Է¹��� �� ���ڿ��� ���� ���� ���
//		min = Math.min(x, y);
		
		for (i=min ; i>0 ; i--) {	// �ִ������� ���ϴ� for��
			if(x%i==0 && y%i==0) {
				break;
			}
		}
		
		return i;	// �ִ����� �� return
	}
}
