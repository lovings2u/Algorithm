package study6;

import java.util.Scanner;

public class ctu_stock { //수상한 주식

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt(); //주식거래가 이루어지는 날
		int M= sc.nextInt(); //초기 자본금
		int [] p = new int[D]; //각 날짜의 한주 가격
		int min=80000; //p<=40000이므로 이 값보다 큰값으로 일단 초기화
		int max=0; int profit=0;
		
		//해당 날짜의 한주 가격을 입력받는것과 동시에 계산 
		for(int i=0;i<p.length;i++){ 
			p[i]=sc.nextInt(); //해당 날짜의 가격 입력받음
			min=Math.min(min, p[i]); //그때 그 가격이 min값 보다 작으면 그 값을 min에 할당
			profit=(p[i]*(M/min))-(min*(M/min)); 
			//(M/min) -> 가격이 min에 해당하는 가격으로 주식을 살 것이고, 그때 주식 개수 파악
			// p[i]*(M/min) -> 그것을 현재 주식값으로 곱하면, 현재 날짜에 주식을 팔때 받는 돈이 계산됨
			// min*(M/min) -> min에 해당하는 날짜의 가격으로 샀을 테니까  이 값을 빼주면 이익 값이 나옴
			
			max=Math.max(max, profit); //이때 현재 주식값으로 팔때의 profit과 max에 들어있는 이익을 비교해서 큰값을 max에 저장
		}
		System.out.println(max); //최종적으로 max값 출력		
	}

}
