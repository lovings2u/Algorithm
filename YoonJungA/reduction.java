package study4;

import java.util.Scanner;

public class reduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int b1=sc.nextInt(); int s1=sc.nextInt();
		int b2=sc.nextInt(); int s2=sc.nextInt();
		int result=0;
		
		if(b1<s1){ //큰수는 큰수끼리
			int temp=b1;
			b1=s1;
			s1=temp;
		}
		if(b2<s2){ //비교하기 위해서
			int temp=b2;
			b2=s2;
			s2=temp;
		}
		
		if(b1<=b2&&s1<=s2){//복사용지가 더 크거나 같으면
			result=100;
		}else if(b1<=b2){
			result=(s2*100)/s1;			
		}else if(s1<=s2){
			result=(b2*100)/b1;
		}else{
			int temp1 = (b2*100)/b1;
			int temp2 = (s2*100)/s1;
			if(temp1>=temp2){
				result=temp2;
			}else result=temp1;
		}
		System.out.println(result+"%");
	}
}
