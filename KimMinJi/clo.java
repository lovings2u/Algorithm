import java.util.Scanner;

public class clo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int h=sc.nextInt();
		double m;
		
		//�Է��� �ð��� ��ħ��ġ (360/12)*h
		//��ħ�� 1�п� 360/60����  1�п� 6���� �̵�
		//��ħ�� 1�ð��� 30��������
		//�׷� ��ħ�� 1�п� 60/30 0.5�� ������
		//��ħ6m�̶� ��ħ30h+1/2m�� ���ƾ���
		
		m=(60/11)*h;
		
		if(h==12){System.out.println("0.000000");}
		else{
			if(m<5*h){
				System.out.printf("%.6h",m);
			}else{
				System.out.println("CAN'T SEE!");}
			
		}

	}

}
