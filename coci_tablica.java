package study6;

import java.util.Scanner;

public class coci_tablica {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		
		// a-b-c-d 는 0번
		// c-a-d-b 는 1번
		// d-c-b-a 는 2번
		// b-d-a-c 는 3번
		
		double result[] = new double[4];
		int rotate=0;
		
		result[0]= ((double)A/C)+((double)B/D);
		result[1]= ((double)C/D)+((double)A/B);
		result[2]= ((double)D/B)+((double)C/A);
		result[3]= ((double)B/A)+((double)D/C);
		
		double temp=result[0]; //일단 회전안했을때로 초기화
		for(int i=0; i<result.length; i++)
			temp=Math.max(temp, result[i]); //temp에 최대값 저장
		
		if(temp==result[0]) rotate=0;
		else if(temp==result[1]) rotate=1;
		else if(temp==result[2]) rotate=2;
		else rotate=3;
		
		System.out.println(rotate);
		
		
	}
}
