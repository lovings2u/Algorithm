package study5;

import java.util.Scanner;

public class pie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numerator1 = sc.nextInt(); int denominator1 = sc.nextInt();
		int numerator2 = sc.nextInt(); int denominator2 = sc.nextInt();
		int f_nu, f_deno; //���� ���� �и�
		int gcd; //���� ���� �и��� �ִ�����
		
		if(denominator1!=denominator2){ //�κи� ���� �ٸ���
			numerator1 *= denominator2;
			numerator2 *= denominator1; //��а���
			f_deno=denominator1*denominator2; //����ĺи�
			f_nu=f_deno-(numerator1+numerator2); //����ĺ���			
		}
		else{ //�κи� ���� ������
			f_deno=denominator1;
			f_nu=f_deno-(numerator1+numerator2);
		}
		int g_nu = f_nu; int g_deno = f_deno;
		
		//�ִ� ����� ���ϱ�,
		//�̹����� ��� �и� ������ ���ں��� ŭ
		//�и𿡼� ���ڸ� �����°��� �ݺ��ؼ� ���ڰ� 0�̵Ǹ� �׶��� �и� �ִ�����
		while(true){
			if(g_nu==0){  
				gcd=g_deno; break; 
			}else{
				int temp=g_deno%g_nu;
				g_deno=g_nu;
				g_nu=temp;
			}
		}
		
		if(f_nu==0) System.out.println(f_nu); //0�̸� 0���
		else System.out.println(f_nu/gcd+"/"+f_deno/gcd); //�ƴϸ� ���ںи� ���� �ִ������� ������ ���=���м�
	}

}
