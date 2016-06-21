package c0620;

import java.util.Scanner;

public class midp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x [] = new int[N];
		int y [] = new int[N];
		int result [] = new int[N];
		int num0=0; int num1=0; int num2=0; int num3=0;
		
		for(int i=0; i<N; i++){
			if(sc.nextInt()%2==0) x[i]=0;
			else x[i]=1;
			
			if(sc.nextInt()%2==0) y[i]=0;
			else y[i]=1;
			
			result[i]=x[i]*2+y[i]*1;
		}
			
		for(int i=0; i<N; i++){
			if(result[i]==0) num0++;
			else if(result[i]==1) num1++;
			else if(result[i]==2) num2++;
			else num3++;
		}
		
		if(num0+num1+num2+num3==0)
			System.out.println("impossible");
		else
			System.out.println((((num0)*(num0-1))/2)+(((num1)*(num1-1))/2)+(((num2)*(num2-1))/2)+(((num3)*(num3-1))/2));
		
	}

}

/*
public class midp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x [] = new int[N];
		int y [] = new int[N];
		int count=0;
		
		for(int i=0; i<N; i++){
			x[i]=sc.nextInt(); y[i]=sc.nextInt();
		}
		
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				if(x[i]%2!=0&&x[j]%2==0||x[i]%2==0&&x[j]%2!=0) continue;
				else{
					if(y[i]%2!=0&&y[j]%2==0||y[i]%2==0&&y[j]%2!=0) continue;
					else count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
*/