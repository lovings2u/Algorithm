package exercise;

import java.util.Scanner;

public class d_f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float N=sc.nextFloat();
		int a=0;
		
		if(N>=0){
			while(true){
				N-=1;
				a++;
				if(N<1){
					System.out.printf(a+" "+"%.2f",N);
					break;
				}}}
		else{
			while(true){
				N+=1;
				a--;
				if(N>0){
					System.out.printf(a+" "+"%.2f",N);
					break;
					}}}		
				
			}
		
		
	}


