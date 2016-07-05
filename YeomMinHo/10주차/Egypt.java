package egypt;
import java.util.Scanner;

public class Egypt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int gcd = 0;
		int temp = 0;
		int num = 2;
		
		n = sc.nextInt();	// 분자값 입력
		m = sc.nextInt();	// 분모값 입력
		
		while (n != 1) {		// 분자값이 1이 되면 반복문 밖으로 나감
			gcd = gcdCal(n,m);	// n과 m의 최대공약수
			n = n/gcd;
			m = m/gcd;
			temp = lcmCal(m,num);	// m과 num의 최소공배수 = 분모값
			
			if ((n * (temp/m)) - (temp/num) > 0) {	//n * (temp/m)) - (temp/num) => 이 식은 분수 계산할 시 분자의 걸과값 
				n = (n * (temp/m)) - (temp/num);	//n이 0보다 클 경우에 분자의 결과 값 넣어줌
				m = temp;							//temp는 m과 num의 최소공배수 = 분모값 = m
			
				System.out.print("1/" + num + " ");	//해당하는 단위분수 출력
				
			}

			if (n==1) {
				System.out.print("1/" + m);	// n이 1이 될 경우 마지막으로 값 하나 더 출력
			}
			
			num++;
		}
	}
	
	public static int gcdCal(int x, int y) {	// 최대공약수(gcd) 구하는 메소드
		int i, min;
		min = Math.min(x, y);
		
		for (i=min ; i>0 ; i--) {	// 최대공약수를 구하는 for문
			if(x%i==0 && y%i==0) {
				break;
			}
		}
		
		return i;	// 최대공약수 값 return
	}
	
	public static int lcmCal(int x, int y) {	// 최소공배수(lcm) 구하는 메소드
		int gcd = gcdCal(x,y);
		
		return gcd * (x/gcd) * (y/gcd);
	}
}
