import java.util.Scanner;

public class Log {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0, x=1;
		int top=0, buttom=0;
		
		num = sc.nextInt();
		
		while (sum<num) {	// ���ϴ� �볪�� �� ���ϱ�
			sum = 0;
			x++;
			for(int i=1; i<=x ; i++) {
				sum += i;
			}
		}
		
		buttom = x;	// ���ϴ� �볪�� ��
		
		for (int i=x ; i>=1 ; i--) {	// �ֻ�� �볪�� ���ϱ�
			if ((num-i) > 0) {
				num -= i;	
			} else {
				break;
			}
		}
		
		System.out.println(buttom + " " + num);
	}
}
