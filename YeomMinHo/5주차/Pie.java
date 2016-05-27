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
		
		gcd = GcdCal(b,d);	// 최소공배수를 구하기 위해 최대공약수 계산
		lcm = gcd * (b/gcd) * (d/gcd);	// 최소공배수 계산
		
		a = lcm/b * a;	// 입력받은 분수에 최소공배수를 이용하여 첫번째 분자값 계산
		c = lcm/d * c;	// 입력받은 분수에 최소공배수를 이용하여 두번째 분자값 계산

		resulta = lcm-(a+c);	// 남은 파이양의 분자 값
		gcd = GcdCal(resulta, lcm);	// 기약분수로 출력하기 위한 최대공약수 계산
		
		if ( resulta == 0 ) {	// 남은 파이의 양이 없을 경우
			System.out.println("0");
		} else {	// 남은 파이의 양이 있을 경우
			System.out.println(resulta/gcd + "/" + lcm/gcd);	
		}
	}
	
	public static int GcdCal(int x, int y) {	// 최대공약수(gcd) 구하는 메소드
		int i, min;

		min = x<=y ? x:y;	// 입력받은 두 숫자에서 작은 값을 출력
//		min = Math.min(x, y);
		
		for (i=min ; i>0 ; i--) {	// 최대공약수를 구하는 for문
			if(x%i==0 && y%i==0) {
				break;
			}
		}
		
		return i;	// 최대공약수 값 return
	}
}
