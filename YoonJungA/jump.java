package c0628;

import java.util.Scanner;

public class jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++){
			
			int N = sc.nextInt(); //돌의 개수
			int stone [] = new int[N+1];
			
			stone[0]=0;
			for(int j=1; j<stone.length; j++)
				stone[j]=sc.nextInt();
			
			int K = sc.nextInt();
			
			int sum=0;
			int add =0;
			int check =0;
			int count =0;
			int no =0;
			
			for(int m=1; m<stone.length; m++){
				
				check=stone[m]-stone[m-1];
				add += check;
				sum += check;
				
				if(check>K){
					no=-1;
					break;
				}
				
				if(add>K){
					add=0;
					m -= 1;
					sum -= check;
					count++;
				}
				
				no=0;
				if(sum == stone[stone.length-1]) count++;
				else no=-1;
	
			}
			
			
			System.out.println("Case #"+(i+1));
			
			if(no==-1) System.out.println(no);
			else 	System.out.println(count);
			
			
		}
	}

}
