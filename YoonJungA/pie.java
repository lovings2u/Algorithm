package study5;

import java.util.Scanner;

public class pie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numerator1 = sc.nextInt(); int denominator1 = sc.nextInt();
		int numerator2 = sc.nextInt(); int denominator2 = sc.nextInt();
		int f_nu, f_deno; //최종 분자 분모
		int gcd; //최종 분자 분모의 최대공약수
		
		if(denominator1!=denominator2){ //두분모가 서로 다르면
			numerator1 *= denominator2;
			numerator2 *= denominator1; //통분과정
			f_deno=denominator1*denominator2; //통분후분모
			f_nu=f_deno-(numerator1+numerator2); //통분후분자			
		}
		else{ //두분모가 서로 같으면
			f_deno=denominator1;
			f_nu=f_deno-(numerator1+numerator2);
		}
		int g_nu = f_nu; int g_deno = f_deno;
		
		//최대 공약수 구하기,
		//이문제의 경우 분모가 무조건 분자보다 큼
		//분모에서 분자를 나누는것을 반복해서 분자가 0이되면 그때의 분모가 최대공약수
		while(true){
			if(g_nu==0){  
				gcd=g_deno; break; 
			}else{
				int temp=g_deno%g_nu;
				g_deno=g_nu;
				g_nu=temp;
			}
		}
		
		if(f_nu==0) System.out.println(f_nu); //0이면 0출력
		else System.out.println(f_nu/gcd+"/"+f_deno/gcd); //아니면 분자분모를 각각 최대공약수로 나눈값 출력=기약분수
	}

}
