package study0614;

import java.util.Scanner;

public class tea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result=0;
		
		if(n%2!=0){ //홀수
			int oddcheck=(n/2)+1; //몫+1이 현재 수 포함 홀수 개수
			for(int i=1,k=1;i<oddcheck;i++,k=k+2)
				result += k;
		}
		else{ //짝수
			int evencheck=n/2; //몫이 현재 수 포함 짝수 개수
			for(int i=1,k=2;i<evencheck;i++,k=k+2)
				result += k;
		}
		
		System.out.println(result);
	}
}

// 1개 : 0			2개 : 0
// 3개 : 1			4개 : 2
// 5개 : 4			6개 : 6
// 7개 : 9
