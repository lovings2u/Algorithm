package study0614;

import java.util.Scanner;

public class complete {

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a[] = new int[100]; //약수 저장 배열
		int sum=0;
		int j=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				a[j]=i; j++;
			}
		}
		
		for(int k=0; k<j-1; k++)	sum+=a[k];
	
		if(num==sum) System.out.println("yes");
		else System.out.println("no");

	}
}
