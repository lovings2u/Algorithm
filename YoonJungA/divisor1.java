package study5;

import java.util.Scanner;

public class divisor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); int B = sc.nextInt();
		int sum=0; int num=0;
		for(int i=A; i<=B; i++){
			if(oddcheck(i)){
				num++;
				sum +=i;
			}
		}
		System.out.println(num+" "+(sum%1000000003));
	}
	public static boolean oddcheck(int a){ //약수개수 홀수여부 판별
		int count=0;
		for(int i=1;i<=a;i++){
			if(a%i==0) count++;
		}
		if(count%2==0) return false;
		else return true;

	}

}
