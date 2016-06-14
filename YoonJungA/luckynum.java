package study0614;

import java.util.Scanner;

public class luckynum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int check = 0; //자리수
		
		int i=1;
		while(true){
			if((int)Math.pow(2,i)>k){
				check=i; break; //check-1은 k가 위치하는 직전 자리수
			}
			i++;
		}
		int num = k-((int)Math.pow(2,check-1));
		//num은 k에서 직전 자리수의 개수까지 뺀것 = 나머지 고려해야할 부분
		
		for(int j=1;j<check+1;j++){
			int seven=j-1;
			int four=check-seven;
			
			
		}

		
		 
		
		
		System.out.println(check+" "+num);
	}

}
